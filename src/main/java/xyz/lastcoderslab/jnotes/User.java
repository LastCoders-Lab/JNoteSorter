package xyz.lastcoderslab.jnotes;

public class User implements Comparable<User>{
    private String name;
    private String password;
    private String email;
    private User(Builder builder) {

    }
    public static class Builder {
        private String name;
        private String password;
        private String email;
        public Builder(String name, String password, String email) {
            this.name = name;
            this.password = password;
            this.email = email;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder password(String password) {
            this.password = password;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
    }
    public static Builder builder() {
        return new Builder("","","");
    }
    @Override
    public int compareTo(User user) {
        int cmp = this.name.compareTo(user.name);
        if (cmp != 0) return cmp;

        cmp = this.password.compareTo((user.password));
        if(cmp != 0) return cmp;

        return this.email.compareTo(user.email);
    }
}
