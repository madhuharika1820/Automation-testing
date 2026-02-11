package restassured_exam;



import org.testng.annotations.DataProvider;

public class dataprovider_exam {
    
    @DataProvider(name = "userIds")
    public Object[][] userIds() {
        return new Object[][] {
            {1},
            {2},
            {3}
        };
    }
}
