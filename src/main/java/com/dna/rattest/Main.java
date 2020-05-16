package com.dna.rattest;

import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;

public class Main {
    public static void main(String... args) throws Exception {
        RatpackServer.start(server -> server
                .serverConfig(c -> c.baseDir(BaseDir.find()).build())
                .handlers(chain -> chain
//                        .get(ctx -> ctx.render("Hello World!"))
//                        .get(":name", ctx -> ctx.render("Hello " + ctx.getPathTokens().get("name") + "!"))

//                        .files(files->files.dir("public").indexFiles("index.html"))

                        .files()
                )
        );
    }
}