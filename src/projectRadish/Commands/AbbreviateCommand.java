package projectRadish;

import projectRadish.BaseCommand;
import projectRadish.MessageInfoWrapper;

public final class AbbreviateCommand extends BaseCommand
{
    @Override
    public void ExecuteCommand(MessageInfoWrapper msgInfo)
    {
        msgInfo.getChannel().sendMessage(DidYouMean.abbreviate(msgInfo.getMsgContent())).queue();
    }
}