package pages

import geb.Page
import org.openqa.selenium.By

class SearchPage extends Page{

    static content = {
        newUserRegister (wait : true) { $(By.id("new_customer"))}
        travelBtn { $(By.cssSelector(".c24-nav-travel"))}
        destination  { $(By.cssSelector(".c24-nav-travel"))}
        airport { $(By.cssSelector(".c24-nav-travel"))}
        searchBtn { $(By.cssSelector(".c24-nav-travel"))}
        onlyHotel { $(By.cssSelector(".c24-travel-traveltype-hotelonly"))}
        destinationWoFlight { $(By.cssSelector(".destinationSuggestionQueryInput__input"))}
        destinationAutocomplete(wait: true) { $(By.id("react-autowhatever-1--item-0"))}
        searchForm { $(By.cssSelector(".searchFormContainer__form"))}
        searchButton { $(By.xpath('//*[@id=\"searchFormContainer\"]/section/form/div[2]/div/div[1]/div[2]/div/div[2]/div/div/button/span'))}
        hotelList(wait: true) { $(By.cssSelector(".hotelResultsList__listContents"))}
        hotelResult(wait: true) { $(By.cssSelector(".hotelResultContainer"))}

    }

    def searchSomething(searchText) {
        onlyHotel.click()
        destinationWoFlight = searchText
        destinationAutocomplete.click()
        searchForm.click()
        searchButton.click()
    }

    def navigateToTravel() {
        travelBtn.click()
    }

    def verifyHotel() {
        hotelList*.isDisplayed()
        hotelResult*.isDisplayed()
    }

}
