import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.Queue;

interface CompilerTool{
    public void execute();
}

class ProgramScanner implements CompilerTool{
    public void execute(){
        System.out.println("Scanning.....");
    }
}

class Parser implements CompilerTool{
    public void execute(){
        System.out.println("Parsing.....");
    }
}

class ProgramNode implements CompilerTool{
    public void execute(){
        System.out.println("Construct Program Node");
    }
}

class BytecodeStream implements CompilerTool{
    public void execute(){
        System.out.println("Output bytecode.....");
    }
}

class Compiler{
    Compiler(){
        _toolKit = new HashMap<String, CompilerTool>();
        _toolKit.put("scanner", new ProgramScanner());
        _toolKit.put("parser", new Parser());
        _toolKit.put("programNode", new ProgramNode());
        _toolKit.put("bytecodeStream", new BytecodeStream());
    }

    public CompilerTool getTool(String name){
        return _toolKit.get(name);
    }

    private Map<String, CompilerTool> _toolKit;
}

class Client{
    Client(){
       _compileFlow = new LinkedList<CompilerTool>();
    }
    public void addToolToFlow(CompilerTool tool){
       _compileFlow.add(tool); 
    }

    public void compile(){
        for(CompilerTool tool : _compileFlow){
            tool.execute();
        }
    }
    private Queue<CompilerTool> _compileFlow; 
}

class Main{
    public static void main(String[] args){
        Compiler compiler = new Compiler();
        Client client = new Client();
        client.addToolToFlow(compiler.getTool("parser"));
        client.addToolToFlow(compiler.getTool("scanner"));
        client.addToolToFlow(compiler.getTool("programNode"));
        client.addToolToFlow(compiler.getTool("bytecodeStream"));
        client.compile();
    }
}
