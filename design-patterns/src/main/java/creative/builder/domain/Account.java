package creative.builder.domain;

public class Account {
    private final int id;
    private final String email;
    private final Address address;
    private final Name name;

    private Account(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.address = builder.address;
        this.name = builder.name;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", email: " + email + ", address: " + address + ", name: " + name;
    }
    public static class Builder {
        private int id;
        private String email;
        private Address address;
        private Name name;

        public Builder id(final int id) {
            this.id = id;
            return this;
        }

        public Builder email(final String email) {
            this.email = email;
            return this;
        }

        public Builder address(final Address address) {
            this.address = address;
            return this;
        }

        public Builder name(final Name name ) {
            this.name = name;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }
}
