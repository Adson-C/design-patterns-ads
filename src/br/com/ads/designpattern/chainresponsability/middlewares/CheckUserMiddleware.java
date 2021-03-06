package br.com.ads.designpattern.chainresponsability.middlewares;

import br.com.ads.designpattern.chainresponsability.server.Server;

public class CheckUserMiddleware extends Middleware {
    public Server server;

    public CheckUserMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("E-mail Invalido");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("E-mail ou senha Invalidos");
            return false;
        }
        return checkNext(email, password);
    }
}
