package lecture.array.hashing;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Map<Integer, String> manga = new HashMap<>();
        manga.put(1, "Chainsaw Man");
        manga.put(2, "Jujutsu Kaisen");
        manga.put(3, "Night");
        manga.put(4, "One piece");
        manga.put(5, "Bleach");
        manga.put(null , null); // HashMap allows one null key only.
        manga.put(6, "Naruto");
        manga.put(null, "Tokyo Ghoul");// override another one
        manga.put(null, "Choujin X");
        manga.put(1, "Chainsaw man"); // ignored
        manga.put(7, "Batman");

        manga.put(9, null);
        manga.put(10, null);
        manga.put(0, null);

        System.out.println(manga.size()); // only allow one null key all other null keys are
        // ignored

        System.out.println(manga);

    }
}
/**
 *
 */
