package ir.isc.session7num2;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Read {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
			// TODO Auto-generated method stub
			ObjectMapper objectMapper = new ObjectMapper();

			File file = new File("data-account.json");
			Account account = objectMapper.readValue(file, Account.class);
			System.out.println(account);

		}

	}
