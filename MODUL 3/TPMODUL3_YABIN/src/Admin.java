class Admin extends User {
    public Admin(String name, int id) {
        super(name, id);
    }

    public void manageSystem(String course) {
        System.out.println("Admin " + name + " is managing " + course);
    }

    @Override
    public String getUserDetails() {
        return super.getUserDetails() + "\nRole: Admin";
    }
}
