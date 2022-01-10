package br.com.ads.designpattern.adapter.utils;

public class Token {

    private String token;

    public Token(String token) {
        this.token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkRlc2lnbiBQYXR0ZXJzIiwiaWF0IjoxNTE2MjM5MDIyfQ.PFVaM20udj4Jh_XUM_89ooEkSExzCZ5p6FzpS_ZY26Q";

    }

    public Token() {

    }

    public String getToken() {
        return token;
    }
}
