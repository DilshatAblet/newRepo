package day42_static;

import java.util.ArrayList;
import java.util.Arrays;

public class ServerObject {

    public static void main(String[] args) {

        Server[] servers= {new Server(),new Server(),new Server(),new Server()};

        servers[0].setInfo("veronica",12522,18,true);
        servers[1].setInfo("jesica",12343,16,false);
        servers[2].setInfo("miami",13544,12,false);
        servers[3].setInfo("lillian",134424,19,true);

        ArrayList<Server> everyServer = new ArrayList<>();
        everyServer.addAll(Arrays.asList(servers));


        for(Server each:everyServer){
            System.out.println(each);
        }

        System.out.println();

    }

}
