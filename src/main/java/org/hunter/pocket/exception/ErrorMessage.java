package org.hunter.pocket.exception;

/**
 * @author wujianchuan
 */
public interface ErrorMessage {
    String POCKET_CONNECTION_VARIABLE_EXCEPTION = "The database validation failed.";
    String POCKET_CONNECT_DATABASE_EXCEPTION = "The database connection failed. Please make sure that the address, username and password are correct.";
    String POCKET_DRIVER_CLASS_NOTFOUND_EXCEPTION = "DriverNameClass was not found.";
    String POCKET_NODE_NOTFOUND_EXCEPTION = "No database configuration node was found.";
    String POCKET_CONNECTION_RELEASE_EXCEPTION = "Database connection release failed.";
    String POCKET_IO_RELEASE_EXCEPTION = "PreparedStatement ResultSet release failed.";
}