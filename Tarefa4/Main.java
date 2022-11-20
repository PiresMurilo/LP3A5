package Tarefa4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String[] friends = {"Rachel", "Phoebe", "Ross", "Chandler", "Monica", "Joey"};

        System.out.println("\nUsando toList():");
        List<String> friendsList = Main.getList(friends);
        friendsList.forEach(System.out::println);

        System.out.println("\nUsando toMap():");
        Map<String, Integer> friendsMap = Main.getMap(friendsList);
        friendsMap.forEach((key, value) -> {
            System.out.println(key + " tem " + value + " letras");
        });

        System.out.println("\nUsando toSet():");
        Set<String> friendsSet = Main.getSet(friends);
        friendsSet.forEach(System.out::println);

        System.out.println("\nUsando counting():");
        System.out.println("O grupo tem " + Main.getLength(friends) + " amigos!");

        System.out.println("\nUsando joining():");
        System.out.println("Se todos eles fossem um só, seu nome seria " + Main.getJoinedString(friends));
    }

    //Métodos auxiliares
    public static List<String> getList(String[] friends) {
        return Stream.of(friends).collect(Collectors.toList());
    }

    public static Map<String, Integer> getMap(List<String> friendsList) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        friendsList.stream().forEach(
                (friend) -> map.put(friend, friend.length())
        );
        return map;
    }

    public static Set<String> getSet(String[] friends) {
        return Stream.of(friends).collect(Collectors.toSet());
    }

    public static Long getLength(String[] friends) {
        return Stream.of(friends).collect(Collectors.counting());
    }

    public static String getJoinedString(String[] friends) {
        return Stream.of(friends).collect(Collectors.joining());
    }

}
