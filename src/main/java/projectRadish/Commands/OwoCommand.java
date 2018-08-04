package projectRadish.Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public final class OwoCommand extends BaseCommand
{
    @Override
    public String getDescription() {
        return "Translates your input into unintewwigibwe gibbewish :3";
    }

    @Override
    public void ExecuteCommand(String content, MessageReceivedEvent event)
    {
        String reply = content;

        reply = reply.replaceAll("l", "w");
        reply = reply.replaceAll("r", "w");
        reply = reply.replaceAll("L", "W");
        reply = reply.replaceAll("R", "W");
        reply = reply.replaceAll(" :\\)", " OwO");
        reply = reply.replaceAll(" :'\\(", " QnQ");
        reply = reply.replaceAll(" ;\\)", " ;3");
        reply = reply.replaceAll(" -_-", " UwU");
        reply = reply.replaceAll(" \\^_\\^", " ^w^");
        reply = reply.replaceAll(" >:\\)", " >:3");

        event.getChannel().sendMessage(reply).queue();
    }
}