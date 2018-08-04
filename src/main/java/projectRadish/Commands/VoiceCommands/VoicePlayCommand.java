package projectRadish.Commands.VoiceCommands;

import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import projectRadish.Commands.BaseCommand;
import projectRadish.MessageListener;

public final class VoicePlayCommand extends BaseCommand
{
    @Override
    public String getDescription() {
        return "Queues up the song your input links to.\n" +
                "The bot will resume playback and join the Voice Channel if it was not already connected.";
    }

    @Override
    public void ExecuteCommand(String content, MessageReceivedEvent event)
    {
        if (event.isFromType(ChannelType.PRIVATE)) {
            event.getChannel().sendMessage("This command cannot be used in a PM.").queue();
            return;
        }

        MessageListener.vp.loadAndPlay(event.getTextChannel(), content);
    }
}