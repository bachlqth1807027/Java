package entity;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Employee {
    private String name;
    private String address;
    private String email;
    private String account;
    private String password;
    private String createdAt;
    private String updatedAt;
    private int status;
    private ArrayList<String> errors;

    public Employee(String account, String name, String address, String email, String password, Timestamp createdAt, Timestamp updatedAt, int status) {
    }

    public Employee(String account) {
        this.account = account;
    }

    public Employee(String name, String address, String email, String account, String password) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.account = account;
        this.password = password;
    }

    public Employee(String name, String address, String email, String account, String password, String createdAt, String updatedAt) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.account = account;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public boolean isValid() {
        this.errors = new ArrayList<String>();
        boolean valid = true;
        if (this.name == null || this.name.length() == 0) {
            errors.add("Tên không được bỏ trống!");
            valid = false;
        }
        if (this.address == null || this.address.length() == 0) {
            errors.add("Địa chỉ không được bỏ trống!");
            valid = false;
        }
        if (this.email == null || this.email.length() == 0) {
            errors.add("Email không được bỏ trống!");
            valid = false;
        }
        if (this.account == null || this.account.length() == 0) {
            errors.add("Tài khoản không được bỏ trống!");
            valid = false;
        }
        if (this.password == null || this.password.length() == 0) {
            errors.add("Mật khẩu không được bỏ trống!");
            valid = false;
        }
        return valid;
    }

    public void printErrors() {
        for (int i = 0; i < this.getErrors().size(); i++) {
            System.err.printf(" - %s\n", this.getErrors().get(i));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ArrayList<String> getErrors() {
        return errors;
    }

    public void setErrors(ArrayList<String> errors) {
        this.errors = errors;
    }
}

