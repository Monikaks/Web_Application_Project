
public class login {
private String name ;
private String email;
private String phone ;
private String website ;
private String priority ;
private String type;
private String text ;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public String getPhone() {
return phone;
}
public void setPhone(String phone) {
this.phone = phone;
}
public String getWebsite() {
return website;
}
public void setWebsite(String website) {
this.website = website;
}
public String getPriority() {
return priority;
}
public void setPriority(String priority) {
this.priority = priority;
}
public String getText() {
return text;
}
public void setText(String text) {
this.text = text;
}
public String getType() {
return type;
}
public void setType(String type) {
this.type = type;
}
@Override
public String toString() {
return "Login [name=" + name + ", email=" + email + ", phone=" + phone + ", website=" +
website + ", priority="
+ priority + ", type=" + type + ", text=" + text + "]";
}
}
