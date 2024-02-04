<h1>
EmojiListener</h1>
<h2>Description</h2> 
The EmojiListener is a Bukkit plugin listener designed to enhance the chat experience by replacing certain text patterns with corresponding emoji representations. Created by Paul "Paqlio," this listener triggers on player chat events and replaces predefined strings with emoji equivalents.

<h2>Usage</h2>
- Ensure the listener is registered in your plugin.
- Players can use specific trigger strings to automatically replace them with emojis in their chat messages.

<h2>Example Triggers and Replacements</h2>
<code>
- :) → 😊
- :( → 😔
- :D → 😀
- :fire: → 🔥
- <3 → ❤️
- :yes: → ✅
- :no: → ❌ 
</code>
<h2> How It Works </h2>
The listener utilizes the AsyncPlayerChatEvent to intercept and modify player messages before they are sent to the chat. It scans the message for predefined trigger strings (e.g., words starting with ":") and replaces them with corresponding emojis using the getEmoji method.
