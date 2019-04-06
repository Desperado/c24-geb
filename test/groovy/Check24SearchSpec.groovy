import geb.spock.GebSpec
import pages.Check24HomePage
import pages.SearchPage
import spock.lang.Shared
import spock.lang.Stepwise


@Stepwise
class Check24SearchSpec extends GebSpec {
    @Shared searchWord

    def setupSpec() {
        searchWord = "Singapur"
    }

    def "Search anything on check24 travel section"() {
        given: "I am using geckodriver"
        System.setProperty("webdriver.gecko.driver", "/Users/ruslan/work/c24-geb/src/test/resources/geckodriver")

        when: "I am on Check24 Home Page"
        to Check24HomePage

        and: "I navigate to the travel search page"
        SearchPage searchPage = to SearchPage
        searchPage.navigateToTravel()

        and: "I search for some destination"
        searchPage.searchSomething(searchWord)


        then: "I verify"
        searchPage.verifyHotel()

    }
}