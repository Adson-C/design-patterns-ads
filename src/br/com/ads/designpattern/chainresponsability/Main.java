package br.com.ads.designpattern.chainresponsability;


import br.com.ads.designpattern.chainresponsability.middlewares.CheckPermissionMiddleware;
import br.com.ads.designpattern.chainresponsability.middlewares.CheckUserMiddleware;
import br.com.ads.designpattern.chainresponsability.middlewares.Middleware;
import br.com.ads.designpattern.chainresponsability.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static Server server;

    public static void init() {
        server = new Server();
        server.registerUser("adsonconcecao@yahoo.com.br", "12345");
        server.registerUser("user@yahoo.com.br", "54321");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean done;

        do {
            System.out.println("Digite o e-mail: ");
            String email = reader.readLine();
            System.out.println("Digite sua senha");
            String password = reader.readLine();
            done = server.login(email,password);
        }while (!done);

    }

}
