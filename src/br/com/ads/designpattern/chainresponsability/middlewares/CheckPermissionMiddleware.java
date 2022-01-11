package br.com.ads.designpattern.chainresponsability.middlewares;

public class CheckPermissionMiddleware extends  Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("adsonconcecao@yahoo.com.br")) {
            System.out.println("Bem vindo Adminitrador!");
            return true;
        }
        System.out.println("Bem vindo");
        return checkNext(email,password);
    }
}
