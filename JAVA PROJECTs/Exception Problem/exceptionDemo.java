class exceptionDemo {
    void test(int age) throws UnderAge {
        if (age < 18) {
            throw new UnderAge(age);
        }
    }
}