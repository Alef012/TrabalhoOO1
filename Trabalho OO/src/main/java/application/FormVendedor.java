
package application;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

import models.Pessoa;
import models.Vendedor;
import repositorios.RepositorioDeVendedores;

/**
 * <p>
 * <b>FormVendedor</b> </p>
 * <p>
 * Tela de cadastro de Vendedor</p>
 *
 * @author Felipe Alef
 * @version 1.0
 * @since out 2021
 */

public class FormVendedor extends javax.swing.JFrame {
    private static RepositorioDeVendedores vendedores;
    private static int indice;

    /**
     * Construtor da classe
     */
    public FormVendedor() {
        vendedores = new RepositorioDeVendedores();
        initComponents();
        this.desabilitarFormulario();
        this.cadastrar();
        this.CarregaTabela();
    }

    /**
     * Retorna a lista de vendedores
     *
     * @return
     */
    public ArrayList<Vendedor> devolverVendedor() {
        return this.vendedores.listar();
    }

    /**
     * Funcção que deixa o formulário de cadastro invisível
     */

    public void desabilitarFormulario() {
        this.jTextFieldNomeVendedor.setVisible(false);
        this.jTextFieldCPFVendedor.setVisible(false);
        this.jTextFieldRGVendedor.setVisible(false);
        this.jTextFieldDataNascVendedor.setVisible(false);
        this.jTextFieldCodigoVendedor.setVisible(false);
        this.jLabelCodigoVendedor.setVisible(false);
        this.jButtonLimparCampos.setVisible(false);
        this.jButtonCancelarCliente.setVisible(false);
        this.jButtonSalvarCliente.setVisible(false);
        this.jLabelCPFVendedor.setVisible(false);
        this.jLabelCodigoVendedor.setVisible(false);
        this.jLabelNomeVendedor.setVisible(false);
        this.jLabelRGVendedor.setVisible(false);
        this.jLabelCodigoVendedor.setVisible(false);
        this.jLabelDataNascCVendedor.setVisible(false);
    }

    /**
     * Funcção que deixa o formulário de cadastro visível
     */
    public void habilitarFormulario() {
        this.jTextFieldNomeVendedor.setVisible(true);
        this.jTextFieldCPFVendedor.setVisible(true);
        this.jTextFieldRGVendedor.setVisible(true);
        this.jTextFieldDataNascVendedor.setVisible(true);
        this.jTextFieldCodigoVendedor.setVisible(true);
        this.jLabelCodigoVendedor.setVisible(true);
        this.jButtonLimparCampos.setVisible(true);
        this.jButtonCancelarCliente.setVisible(true);
        this.jButtonSalvarCliente.setVisible(true);
        this.jLabelCPFVendedor.setVisible(true);
        this.jLabelCodigoVendedor.setVisible(true);
        this.jLabelNomeVendedor.setVisible(true);
        this.jLabelRGVendedor.setVisible(true);
        this.jLabelCodigoVendedor.setVisible(true);
        this.jLabelDataNascCVendedor.setVisible(true);
    }

    /**
     * Função para ser colocada no botão novo, habilita o formulário de cadastro de vendedores
     */
    private void novo() {
        this.habilitarFormulario();
    }

    /**
     * Função que limpa os campos do jtext
     * deixando uma String vazia neles
     */

    public void limparCampos() {
        jTextFieldCPFVendedor.setText("");
        jTextFieldDataNascVendedor.setText("");
        jTextFieldNomeVendedor.setText("");
        jTextFieldRGVendedor.setText("");
    }

    /**
     * Função que fecha a tela de Vendedor
     */
    private void sair() {
        this.desabilitarFormulario();
        this.setVisible(false);
    }
    /**
     * Cancela o cadastro de um novo vendedor
     * limpa os campos e desabilita os formulários
     */

    private void cancelar() {
        this.limparCampos();
        this.desabilitarFormulario();
    }
    /**
     * Salva os termos digitados no Jtext em um objeto Vendedor e adiciona no repositório
     */
    private void salvar() {
        Vendedor vendedor = new Vendedor();
        vendedor.setCpf(jTextFieldCPFVendedor.getText());
        vendedor.setDataNasc(jTextFieldDataNascVendedor.getText());
        vendedor.setNome(jTextFieldNomeVendedor.getText());
        vendedor.setRg(jTextFieldRGVendedor.getText());
        vendedor.setCodigoVendedor(jTextFieldCodigoVendedor.getText());
        vendedores.cadastrar(vendedor);
        this.desabilitarFormulario();
        this.CarregaTabela();
        this.limparCampos();
    }
    /**
     * Função que carrega a tabela com os vendedores cadastrados
     */
    public void CarregaTabela() {

        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome", "CPF", "RG", "DataNasc", "Codigo"}, 0);

        for (int i = 0; i < vendedores.tamanho(); i++) {
            Object linha[] = new Object[]{
                    vendedores.obter(i).getNome(),
                    vendedores.obter(i).getCpf(),
                    vendedores.obter(i).getRg(),
                    vendedores.obter(i).getDataNasc(),
            };
            modelo.addRow(linha);

        }

        jTableVendedores.getColumnModel()

                .getColumn(0);
        jTableVendedores.getColumnModel()

                .getColumn(1);
        jTableVendedores.getColumnModel()

                .getColumn(2);
        jTableVendedores.getColumnModel()

                .getColumn(3);
        jTableVendedores.getColumnModel()

                .getColumn(4);
        jTableVendedores.getColumnModel();


        jTableVendedores.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNomeVendedor = new javax.swing.JLabel();
        jTextFieldNomeVendedor = new javax.swing.JTextField();
        jLabelDataNascCVendedor = new javax.swing.JLabel();
        jTextFieldCodigoVendedor = new javax.swing.JTextField();
        jTextFieldCPFVendedor = new javax.swing.JTextField();
        jLabelCPFVendedor = new javax.swing.JLabel();
        jLabelRGVendedor = new javax.swing.JLabel();
        jTextFieldRGVendedor = new javax.swing.JTextField();
        jButtonSalvarCliente = new javax.swing.JButton();
        jButtonCancelarCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButtonSairCalcado = new javax.swing.JButton();
        jButtonLimparCampos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendedores = new javax.swing.JTable();
        jButtonNovoVendedor = new javax.swing.JButton();
        jButtonExcluirVenda = new javax.swing.JButton();
        jButtonEditarVendedor = new javax.swing.JButton();
        jLabelCodigoVendedor = new javax.swing.JLabel();
        jTextFieldDataNascVendedor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelNomeVendedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNomeVendedor.setText("Nome:");

        jTextFieldNomeVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeVendedorActionPerformed(evt);
            }
        });

        jLabelDataNascCVendedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDataNascCVendedor.setText("Data de Nascimento:");

        jTextFieldCodigoVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoVendedorActionPerformed(evt);
            }
        });

        jLabelCPFVendedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCPFVendedor.setText("CPF:");

        jLabelRGVendedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRGVendedor.setText("RG:");

        jTextFieldRGVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRGVendedorActionPerformed(evt);
            }
        });

        jButtonSalvarCliente.setBackground(new java.awt.Color(255, 51, 102));
        jButtonSalvarCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalvarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarCliente.setText("Salvar");
        jButtonSalvarCliente.setBorder(null);
        jButtonSalvarCliente.setBorderPainted(false);
        jButtonSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarClienteActionPerformed(evt);
            }
        });

        jButtonCancelarCliente.setBackground(new java.awt.Color(255, 51, 102));
        jButtonCancelarCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCancelarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarCliente.setText("Cancelar");
        jButtonCancelarCliente.setBorder(null);
        jButtonCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarClienteActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 51, 102));

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alef Shoes");

        jButtonSairCalcado.setBackground(new java.awt.Color(255, 0, 51));
        jButtonSairCalcado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSairCalcado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSairCalcado.setText("X");
        jButtonSairCalcado.setBorder(null);
        jButtonSairCalcado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairCalcadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButtonSairCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonSairCalcado)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addContainerGap())
        );

        jButtonLimparCampos.setBackground(new java.awt.Color(255, 51, 102));
        jButtonLimparCampos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonLimparCampos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimparCampos.setText("Limpar Campos");
        jButtonLimparCampos.setBorder(null);
        jButtonLimparCampos.setBorderPainted(false);
        jButtonLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparCamposActionPerformed(evt);
            }
        });

        jTableVendedores.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Categoria", "Tamanho", "Modelo", "Preço", "Cor", "Código"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTableVendedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVendedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVendedores);

        jButtonNovoVendedor.setBackground(new java.awt.Color(255, 51, 102));
        jButtonNovoVendedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNovoVendedor.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovoVendedor.setText("Novo");
        jButtonNovoVendedor.setBorder(null);
        jButtonNovoVendedor.setBorderPainted(false);
        jButtonNovoVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoVendedorActionPerformed(evt);
            }
        });

        jButtonExcluirVenda.setBackground(new java.awt.Color(255, 51, 102));
        jButtonExcluirVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonExcluirVenda.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluirVenda.setText("Excluir");
        jButtonExcluirVenda.setBorder(null);
        jButtonExcluirVenda.setBorderPainted(false);
        jButtonExcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirVendaActionPerformed(evt);
            }
        });

        jButtonEditarVendedor.setBackground(new java.awt.Color(255, 51, 102));
        jButtonEditarVendedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEditarVendedor.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarVendedor.setText("Editar");
        jButtonEditarVendedor.setBorder(null);
        jButtonEditarVendedor.setBorderPainted(false);
        jButtonEditarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarVendedorActionPerformed(evt);
            }
        });

        jLabelCodigoVendedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCodigoVendedor.setText("Código do Vendedor:");

        jTextFieldDataNascVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataNascVendedorActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 51, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelRGVendedor)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabelNomeVendedor)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jTextFieldNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabelCPFVendedor)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jTextFieldCPFVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTextFieldRGVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabelDataNascCVendedor)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jTextFieldDataNascVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(jButtonCancelarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(jButtonSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(jLabelCodigoVendedor)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(jTextFieldCodigoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButtonLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButtonNovoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonEditarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)
                                                .addComponent(jButtonExcluirVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelNomeVendedor)
                                                        .addComponent(jTextFieldNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelDataNascCVendedor)
                                                        .addComponent(jTextFieldDataNascVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelCPFVendedor)
                                                        .addComponent(jTextFieldCPFVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelCodigoVendedor)
                                                        .addComponent(jTextFieldCodigoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelRGVendedor)
                                                        .addComponent(jTextFieldRGVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButtonSalvarCliente)
                                                        .addComponent(jButtonCancelarCliente))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButtonLimparCampos)
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonEditarVendedor)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButtonExcluirVenda)
                                                .addComponent(jButtonNovoVendedor)))
                                .addGap(43, 43, 43)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeVendedorActionPerformed

    }//GEN-LAST:event_jTextFieldNomeVendedorActionPerformed

    private void jTextFieldCodigoVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoVendedorActionPerformed

    private void jTextFieldRGVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRGVendedorActionPerformed

    }//GEN-LAST:event_jTextFieldRGVendedorActionPerformed

    private void jButtonSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarClienteActionPerformed
        this.salvar();
    }//GEN-LAST:event_jButtonSalvarClienteActionPerformed

    private void jButtonCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarClienteActionPerformed
        this.cancelar();
    }//GEN-LAST:event_jButtonCancelarClienteActionPerformed

    private void jButtonSairCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairCalcadoActionPerformed
        this.sair();
    }//GEN-LAST:event_jButtonSairCalcadoActionPerformed

    private void jButtonLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_jButtonLimparCamposActionPerformed
    /**
     * Função que coloca no indice o valor da posição do vendedor clicado na tabela
     * @param evt
     */
    private void jTableVendedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVendedoresMouseClicked
        //this.habilitarFormulario();
        this.indice = jTableVendedores.getSelectedRow();
    }//GEN-LAST:event_jTableVendedoresMouseClicked

    private void jButtonNovoVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoVendedorActionPerformed
        this.novo();
    }//GEN-LAST:event_jButtonNovoVendedorActionPerformed

    private void jButtonExcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirVendaActionPerformed
        this.excluir();
        this.limparCampos();
        this.desabilitarFormulario();
    }//GEN-LAST:event_jButtonExcluirVendaActionPerformed
    /**
     * utiliza o index para selecionar qual vendedor excluir e remove ele do arraylist
     */
    public void excluir() {
        this.indice = jTableVendedores.getSelectedRow();
        if (indice >= 0 && indice < vendedores.tamanho()) {
            vendedores.remover(indice);
        }
        CarregaTabela();


    }
    /**
     * permite editar um vendedor já cadastrado
     * utiliza o index, que é a posição do cliente no arraylist que é usado na tabela e da set dos elementos nos jtext
     * por ultimo exclui o elemento antigo, assim podendo mudar os elementos e salva-lo novamente
     */

    private void editar() {
        this.habilitarFormulario();
        if (indice >= 0 && indice < vendedores.tamanho()) {
            Vendedor vendedor = vendedores.obter(indice);
            jTextFieldCPFVendedor.setText(vendedor.getCpf());
            jTextFieldDataNascVendedor.setText(vendedor.getDataNasc());
            jTextFieldRGVendedor.setText(vendedor.getRg());
            jTextFieldNomeVendedor.setText(vendedor.getNome());
            jLabelCodigoVendedor.setText(vendedor.getCodigoVendedor());
        }
        this.excluir();
    }

    private void jButtonEditarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarVendedorActionPerformed
        this.editar();
    }//GEN-LAST:event_jButtonEditarVendedorActionPerformed
    /**
     * Cadastra alguns objetos para facilitar a correção
     */
    private void cadastrar() {
        Vendedor a = new Vendedor();
        a.setNome("Michael Jackson");
        a.setCpf("4");
        a.setRg("4");
        a.setDataNasc("27/08/1958");
        a.setCodigoVendedor("1");
        vendedores.cadastrar(a);
        Vendedor b = new Vendedor();
        b.setNome("Renato Russo");
        b.setCpf("5");
        b.setRg("5");
        b.setDataNasc("27/03/1960");
        b.setCodigoVendedor("2");
        vendedores.cadastrar(b);
        Vendedor c = new Vendedor();
        c.setNome("Humberto Gessinger dos Eng do Hawaii");
        c.setCpf("6");
        c.setRg("6");
        c.setDataNasc("24/12/1961");
        c.setCodigoVendedor("3");
        vendedores.cadastrar(c);

    }

    private void jTextFieldDataNascVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataNascVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataNascVendedorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarCliente;
    private javax.swing.JButton jButtonEditarVendedor;
    private javax.swing.JButton jButtonExcluirVenda;
    private javax.swing.JButton jButtonLimparCampos;
    private javax.swing.JButton jButtonNovoVendedor;
    private javax.swing.JButton jButtonSairCalcado;
    private javax.swing.JButton jButtonSalvarCliente;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCPFVendedor;
    private javax.swing.JLabel jLabelCodigoVendedor;
    private javax.swing.JLabel jLabelDataNascCVendedor;
    private javax.swing.JLabel jLabelNomeVendedor;
    private javax.swing.JLabel jLabelRGVendedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVendedores;
    private javax.swing.JTextField jTextFieldCPFVendedor;
    private javax.swing.JTextField jTextFieldCodigoVendedor;
    private javax.swing.JTextField jTextFieldDataNascVendedor;
    private javax.swing.JTextField jTextFieldNomeVendedor;
    private javax.swing.JTextField jTextFieldRGVendedor;
    // End of variables declaration//GEN-END:variables
}
