package io.javabrains.betterreads.search;

import java.util.List;

public class searchResult {
    private int numFound;
    private List<searchResultBook> docs;

    public int getNumFound() {
        return numFound;
    }

    public void setNumFound(int numFound) {
        this.numFound = numFound;
    }

    public List<searchResultBook> getDocs() {
        return docs;
    }

    public void setDocs(List<searchResultBook> docs) {
        this.docs = docs;
    }
}
