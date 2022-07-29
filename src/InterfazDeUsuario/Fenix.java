package InterfazDeUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

public class Fenix extends JFrame{
    private JPanel jpnInterfazDeUsuario;
    private JLabel lblEditorCode;
    private JLabel lblLog;
    private JLabel lblResultados;
    private JTextArea txtCodigoFuente;
    private JTextArea txtResultados;
    private JScrollPane jscpResultados;
    private JScrollPane jscpCodigoFuente;
    private JScrollPane scrResultados;

    //Declaración de MenuBar
    private JMenuBar menuBar;

    //Elementos principales de MenuBar
    private JMenu archivo;
    private JMenu codigo;
    private JMenu editar;
    private JMenu compilador;
    private JMenu acercaDe;

    //Submenus de MenuBar de Archivo
    private JMenuItem abrirMapa;
    private JMenuItem abrirCodigo;

    //Submenus de MenuBar de codigo
    private JMenuItem compilar;
    private JMenuItem ejecutar;
    private JMenuItem compilarYEjecutar;

    //Submenus de MenuBar de compilador
    private JMenuItem recompilarLexico;
    private JMenuItem recompilarSintactico;
    private JMenuItem recompilarTodo;


    public Fenix(){
        super("{Fenix}");

        //Inicializando los objetos creados
        menuBar = new JMenuBar();
        setContentPane(jpnInterfazDeUsuario);

        archivo = new JMenu("{ARCHIVO}");
        codigo = new JMenu("{CODIGO}");
        editar = new JMenu("{EDITAR}");
        compilador = new JMenu("{COMPILADOR}");
        acercaDe = new JMenu("{ACERCA DE}");

        abrirMapa = new JMenuItem("{ABRIR MAPA}");
        abrirCodigo = new JMenuItem("{ABRIR CODIGO}");

        compilar = new JMenuItem("{COMPILAR}");
        ejecutar = new JMenuItem("{EJECUTAR}");
        compilarYEjecutar = new JMenuItem("{COMPILAR Y EJECUTAR}");

        recompilarLexico = new JMenuItem("{RECOMPILAR ANALIZADOR LÉXICO}");
        recompilarSintactico = new JMenuItem("{RECOMPILAR ANALIZADOR SINTÁCTICO}");
        recompilarTodo = new JMenuItem("{RECOMPILAR ANALIZADORES}");

        //Construyendo el MenuBar
        menuBar.add(archivo);
        menuBar.add(codigo);
        menuBar.add(editar);
        menuBar.add(compilador);
        menuBar.add(acercaDe);

        archivo.add(abrirMapa);
        archivo.add(abrirCodigo);

        codigo.add(compilar);
        codigo.add(ejecutar);
        codigo.add(compilarYEjecutar);

        compilador.add(recompilarLexico);
        compilador.add(recompilarSintactico);
        compilador.add(recompilarTodo);

        //Mostrando el MenuBar
        this.setJMenuBar(menuBar);

    }
}
