package com.ohgiraffers.chap07thymeleaf.model.dto;

import lombok.*;

public class SelectCriteria {

    private  int starPage;
    private  int endPage;
    private  int pageNo;

    public SelectCriteria(int starPage, int endPage, int pageNo) {
        this.starPage = starPage;
        this.endPage = endPage;
        this.pageNo = pageNo;
    }

    public int getStarPage() {
        return starPage;
    }

    public void setStarPage(int starPage) {
        this.starPage = starPage;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getEndPage() {
        return endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public SelectCriteria() {
    }
}

