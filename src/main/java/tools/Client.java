package tools;

import java.util.Arrays;
import java.util.List;

public class Client {

	public String lastName, firstName, address, phone, email, password;

	public static Client generateNewClient() {
		Client client = new Client();
		client.lastName = RandomGenerators.getRandomString("lastName");
		client.firstName = RandomGenerators.getRandomString("firstName");
		client.address = RandomGenerators.getRandomString("address");
		client.phone = RandomGenerators.getRandomString("phone");
		client.email = RandomGenerators.getRandomString("email");
		client.password = RandomGenerators.getRandomString("password");
		Client.saveClientToFile(client);
		return client;
	}

	public static Client getRandomExistingClient() {
		List<String> existingClientsList = FileUtils
				.getFileLinesAsList(Constants.EXISTING_CLIENTS_FILE_PATH);
		// we remove the first line which is the header
		existingClientsList.remove(0);
		String clientInfo = StringUtils
				.getRandomItemFromList(existingClientsList);
		List<String> clientDetails = Arrays.asList(StringUtils
				.getSubstringsSplitByKey(clientInfo, ","));
		Client client = new Client();
		client.lastName = clientDetails.get(0);
		client.firstName = clientDetails.get(1);
		client.address = clientDetails.get(2);
		client.phone = clientDetails.get(3);
		client.email = clientDetails.get(4);
		client.password = clientDetails.get(5);
		return client;
	}

	public static String getClientDetailsForCSV(Client client) {
		String clientDetailsForCSV = "\n";
		for (String detail : Arrays.asList(client.lastName, client.firstName,
				client.address, client.phone, client.email, client.password)) {
			clientDetailsForCSV += detail.toString() + ",";
		}
		return clientDetailsForCSV;
	}

	public static void saveClientToFile(Client client) {
		FileUtils.writeToFile(Constants.EXISTING_CLIENTS_FILE_PATH,
				getClientDetailsForCSV(client), true);
	}
}
