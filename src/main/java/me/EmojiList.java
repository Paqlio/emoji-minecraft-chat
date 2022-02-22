package me;

/**
 * @author Paul "Paqlio"
 * @since 22.02.2022 - 21:03
 **/
public class EmojiList {
    public static String Emoji(final String msg){
        return msg.replace("<3","❤️")
                .replace(":fire:","🔥");
    }
}
