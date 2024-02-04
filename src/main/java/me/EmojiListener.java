package me;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 * @author Paul "Paqlio"
 * @since 22.02.2022 - 21:04
 **/
public class EmojiListener implements Listener {
    @EventHandler
    void onChat(AsyncPlayerChatEvent event) {
        var message = event.getMessage();
        message = message.replace(message, getEmoji(getEmoji(message)));
        for (var word : message.split(" ")) {
            if (word.startsWith(":")) {
                message = message.replace(word, getEmoji(word));
                event.setMessage(message);
            }
        }
    }
        private String getEmoji(String emoji){
            return switch (emoji) {
                case ":)" -> "😊";
                case ":(" -> "😔";
                case ":D" -> "😀";
                case ":fire:" -> "🔥";
                case "<3" -> "❤️";
                case ":tak:" -> "✅";
                case ":nie:" -> "❌";
                default -> emoji;
            };
        }
}
