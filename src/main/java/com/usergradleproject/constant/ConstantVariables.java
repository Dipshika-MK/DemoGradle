package com.usergradleproject.constant;

public class ConstantVariables {
    public static final String SELECT_USER = "select * from user where Email=? and Password =?";
    public static final String INSERT_USER = "insert into user" + "(Email, Password, FirstName, LastName ) VALUES " + "(?, ?, ?, ?);";
    public static final String UPDATE_USER = "update user set FirstName=?,LastName=? where Id=?";
    public static final String DELETE_USER ="DELETE FROM user WHERE id = ?";

}
