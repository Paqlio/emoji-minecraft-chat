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
    public void onChat(AsyncPlayerChatEvent e){
        var p = e.getPlayer();
        var msg = e.getMessage();
        e.setMessage(EmojiList.Emoji(msg));
    }
}
