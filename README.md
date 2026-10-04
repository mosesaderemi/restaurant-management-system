# Restaurant Management System

A JavaFX desktop application for restaurant operations. An administrator signs in, maintains the menu, takes customer orders, prints receipts and tracks sales on a dashboard. Data is stored in MySQL.

## Features

- Administrator login
- Dashboard with number of customers, today's income, total income and a customer chart
- Menu management: add, update, delete, clear and search food items, with product type, status and images
- Order screen: choose a product and quantity, add to the order, calculate totals and change, pay and remove items
- Receipt generation through JasperReports (`report.jrxml`)
- Custom window controls (minimise and close) and styled interface

## Tech Stack

| Area | Technology |
| --- | --- |
| Language | Java |
| UI | JavaFX, FXML, CSS |
| Database | MySQL through JDBC |
| Reporting | JasperReports 6.3.0 |
| Libraries | FontAwesomeFX, JFreeChart, MySQL Connector/J 5.1.48 and the JasperReports dependency set |
| IDE | Apache NetBeans project |

## Project Structure

```text
RestaurantManagementSys
├── build.xml
├── nbproject                     NetBeans project configuration and library list
└── src/restaurantmanagementsys
    ├── RestaurantManagementSys.java   Application entry point
    ├── FXMLDocument.fxml / Controller Login
    ├── dashboard.fxml / dashboardController.java   Dashboard, menu and orders
    ├── report.jrxml, report.jasper    Receipt template
    ├── database.java                  JDBC connection helper
    └── data.java, product.java, categories.java   Data holders
```

## Getting Started

### Prerequisites

- JDK 8 with JavaFX, or a JDK with a separate JavaFX SDK configured in your IDE
- Apache NetBeans
- MySQL or MariaDB

### Database

The connection is defined in `src/restaurantmanagementsys/database.java` and expects a database named `restaurant` on `localhost` with the user `root` and an empty password. The code uses the tables `admin`, `category`, `product` and `product_info`. Create the database and these tables before the first run and insert at least one row into `admin` to log in. Column names are defined by the SQL statements in `FXMLDocumentController.java` and `dashboardController.java`.

### Libraries

The compiled `dist` and `build` folders are not stored in this repository. The complete list of required JAR files is in `nbproject/project.properties` under the `file.reference` entries. Download them and add them under Project Properties, then Libraries. The stored paths point to the original development machine and must be re-added on a new computer.

### Run

1. Start MySQL and create the database and tables.
2. Open the `RestaurantManagementSys` folder as a project in NetBeans.
3. Add the libraries and run the project. The main class is `restaurantmanagementsys.RestaurantManagementSys`.

## Security Notes

Passwords are not hashed and some queries are built with string concatenation. Move to prepared statements and hashed passwords before real-world use.

## Author

Aderemi Moses Timileyin
GitHub: [@mosesaderemi](https://github.com/mosesaderemi)
LinkedIn: [linkedin.com/in/mosesaderemi-6a70a5405](https://www.linkedin.com/in/mosesaderemi-6a70a5405)

## License

Released under the MIT License. See the `LICENSE` file for details.
