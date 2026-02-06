package Model.Command;

import java.util.ArrayList;
import java.util.List;

public class OperationInvoker {
    private List<Command> commands = new ArrayList<>();
    
    public void addCommand(Command command){
        this.commands.add(command);
    }
    
    public void executeCommands(){
        if(!commands.isEmpty()){
            this.commands.forEach(c -> c.execute());
            commands.clear();
        }
    }
}
