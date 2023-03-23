package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

public class UndoCommand extends Command{
    public static final String COMMAND_WORD = "undo";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Undo a command that alters listing book.\n";

    public static final String MESSAGE_SUCCESS = "Undo success";

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        model.undo();

        return new CommandResult(MESSAGE_SUCCESS, false, false);
    }
}
