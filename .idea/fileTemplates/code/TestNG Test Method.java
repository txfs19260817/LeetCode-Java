private Solution solution;

@org.testng.annotations.BeforeMethod
public void setUp() throws Exception {
    this.solution = new Solution();
}

@org.testng.annotations.DataProvider(name = "examples")
public Object[][] data() {
    return new Object[][]{
            new Object[]{},
    };
}

@org.testng.annotations.Test(dataProvider = "examples")
public void test${NAME}(Object expect) {
  var actual = solution.${NAME}();
  assertEquals(expect, actual);
  ${BODY}
}