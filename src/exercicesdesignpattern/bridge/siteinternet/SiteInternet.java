/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.bridge.siteinternet;

import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
public class SiteInternet {

    private ArrayList<PageAbstraite> pages;

    public SiteInternet() {
        pages = new ArrayList<>();
    }

    public ArrayList<PageAbstraite> getPages() {
        return pages;
    }

    public void setPages(ArrayList<PageAbstraite> pages) {
        this.pages = pages;
    }

    public void addPage(PageAbstraite page) {
        this.pages.add(page);
    }

    public void addPages(ArrayList<PageAbstraite> pages) {
        this.pages.addAll(pages);
    }

    public void afficheContenu() {
        for (PageAbstraite page : pages) {
            page.afficheContenu();
        }
    }
}
