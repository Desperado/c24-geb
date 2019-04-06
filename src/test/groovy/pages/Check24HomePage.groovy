package pages

import geb.Page


class Check24HomePage extends Page {

    static at = { title == "CHECK24 - Versicherungen, Kredit, Strom, DSL & Reisen im Vergleich" }

    static content = {
        searchPage { module(SearchPageModule) }
    }

}
