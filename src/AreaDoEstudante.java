package concursadosmensal;

import java.awt.CardLayout;

public class AreaDoEstudante extends javax.swing.JFrame {

    // Declaração dos JPanels e CardLayout
    private javax.swing.JPanel jPanelMeusDados;
    private javax.swing.JPanel jPanelEstatisticas;
    private CardLayout cardLayout;

    public AreaDoEstudante() {
        initComponents();
        initMyPanels();  // Inicializa os painéis personalizados
    }

    // Inicializa os painéis personalizados
    private void initMyPanels() {
        // Inicializa o CardLayout para alternar os painéis
        cardLayout = new CardLayout();
        jPanel2.setLayout(cardLayout);

        // Inicializa o painel de "Meus Dados"
        jPanelMeusDados = new javax.swing.JPanel();
        jPanelMeusDados.setBackground(new java.awt.Color(200, 200, 255));  // Cor de fundo
        jPanelMeusDados.add(new javax.swing.JLabel("Aqui estão os seus dados."));  // Conteúdo

        // Inicializa o painel de "Minhas Estatísticas"
        jPanelEstatisticas = new javax.swing.JPanel();
        jPanelEstatisticas.setBackground(new java.awt.Color(200, 255, 200));  // Cor de fundo
        jPanelEstatisticas.add(new javax.swing.JLabel("Aqui estão suas estatísticas."));  // Conteúdo

        // Adiciona os painéis ao jPanel2
        jPanel2.add(jPanelMeusDados, "MeusDados");
        jPanel2.add(jPanelEstatisticas, "MinhasEstatisticas");

        // Mostra o painel de "Meus Dados" por padrão
        cardLayout.show(jPanel2, "MeusDados");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        meusdados = new javax.swing.JButton();
        minhasestatisticas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 230, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/img/nova-removebg-preview.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        meusdados.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        meusdados.setText("Meus Dados");
        meusdados.setToolTipText("");
        meusdados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        meusdados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                meusdadosMouseClicked(evt);
            }
        });

        minhasestatisticas.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        minhasestatisticas.setText("Minhas Estatísticas");
        minhasestatisticas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        minhasestatisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minhasestatisticasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minhasestatisticas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(meusdados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(meusdados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minhasestatisticas)
                .addContainerGap(649, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 857, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    // Evento do botão "Meus Dados"
    private void meusdadosMouseClicked(java.awt.event.MouseEvent evt) {                                       
        cardLayout.show(jPanel2, "MeusDados");
    }

    // Evento do botão "Minhas Estatísticas"
    private void minhasestatisticasMouseClicked(java.awt.event.MouseEvent evt) {                                       
        cardLayout.show(jPanel2, "MinhasEstatisticas");
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AreaDoEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaDoEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaDoEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaDoEstudante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreaDoEstudante().setVisible(true);
            }
        });
    }

    // Declaração de variáveis
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton meusdados;
    private javax.swing.JButton minhasestatisticas;
}
