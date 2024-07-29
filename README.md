# Bank Account

Bank Account is a simple Java application that manages bank account information via terminal input. Users can input account details, and the system will display a summary message.

## Description

This project receives data via the terminal, including the following attributes:

- **Account Number** (Integer)
- **Agency** (Text)
- **Client Name** (Text)
- **Balance** (Decimal)

After entering the information, the system will display a message:

`"Hello [Client Name], thank you for creating an account at our bank. Your agency is [Agency], account [Account Number], and your balance [Balance] is available for withdrawal."`

## Features

- Receive account information via terminal input
- Display a summary message with the provided information

## Technologies

- **Java 17**: Programming language used for development.
- **Maven**: Automation tool for building and dependency management.

## Requirements

- Java 17 or higher
- Maven 3.6 or higher

## Setup and Installation

1. **Clone the repository:**

```sh
git clone https://github.com/jonnrib/bank-account.git
```

2. **Change the Directory:**

```sh
cd /path/to/bank-account
```

3. **Compile the Project Using Maven:**

```sh
mvn clean install
```

4. **Run the Application:**

```sh
mvn exec:java -Dexec.mainClass="com.example.ContaTerminal"
```

1. **Using the Application:**

Run the application and follow the prompts to enter the bank account information.

## Example

The program will prompt you to enter the following details:

- Bank account number (integer)
- Agency (text)
- Client name (text)
- Balance (decimal)

Case:

```
Please enter the agency number:
067-8
Please enter the account number:
1021
Please enter the client name:
MARIO ANDRADE
Please enter the balance:
237.48
```

After entering all the details, the program will display a message like:

```
Hello MARIO ANDRADE, thank you for creating an account at our bank. Your agency is 067-8, account 1021, and your balance 237.48 is now available for withdrawal.
```

## Contribution

Feel free to fork this repository and contribute by submitting a pull request.

1. Fork the project.
2. Create a branch for your feature (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a Pull Request.

## License

This project is licensed under the MIT License. See [LICENSE](/LICENSE) for more information.

## Contact

Jonnathan Ribeiro - jrib_st@outlook.com

Project Link: https://github.com/jonnrib/bank-account
