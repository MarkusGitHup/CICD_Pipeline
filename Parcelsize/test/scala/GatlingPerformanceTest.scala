import io.gatling.core.Predef._
import io.gatling.http.Predef._

class GatlingPerformanceTest extends Simulation {

  val httpProtocol = http
    .baseUrl("http://localhost:8082")
    .inferHtmlResources()
    .acceptHeader("application/json, text/plain, */*")
    .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36")

  val headers_0 = Map("Origin" -> "http://localhost:8080")


  val scn = scenario("GatlingPerformanceTest")
    .exec(http("request_0")
      .get("/rest/parcel/length/10/width/5/height/5")
      .headers(headers_0))

  setUp(scn.inject(atOnceUsers(100))).protocols(httpProtocol)
}
