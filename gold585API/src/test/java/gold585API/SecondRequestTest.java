package gold585API;

import static io.restassured.RestAssured.get;

import org.json.JSONException;
import org.junit.jupiter.api.Test;



class SecondRequestTest {

	@Test
	void test() throws JSONException{
		get("https://www.gold585.ru/upload/iblock/834/8347706a5658bc280505d8c863ba81ec.jpg").then().assertThat().statusCode(200);
		
	}

}
