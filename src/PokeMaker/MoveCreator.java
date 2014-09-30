/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokeMaker;

/**
 *
 * @author Wojtek
 */
public class MoveCreator extends javax.swing.JFrame {

    private MoveDex index;

    public MoveCreator(MoveDex index) {
        this.index = index;
        try {
            this.index.loadList("moves.txt");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        initComponents();
        repaint();
    }

    @Override
    public void repaint() {
        MoveListCB.setModel(new javax.swing.DefaultComboBoxModel(index.getArray()));
        super.repaint();
    }

    @Override
    public void dispose() {
        index.saveList("moves.txt");
        super.setVisible(false);
        //System.exit(0);
    }

    private boolean[] flags() {
        return new boolean[]{ContactCB.isSelected(), ChargeCB.isSelected(), RechargeCB.isSelected(),
            BlockCB.isSelected(), ReflectCB.isSelected(), SnachCB.isSelected(), OHKOCB.isSelected(),
            MirrorCB.isSelected(), GravityCB.isSelected(), DefrostCB.isSelected(), HealCB.isSelected(),
            IgnoreSubCB.isSelected(), MentalCB.isSelected(), CritCB.isSelected(), BallCB.isSelected(),
            PunchCB.isSelected(), SoundCB.isSelected(), PowderCB.isSelected(), JawCB.isSelected(),
            PulseCB.isSelected(), SpecialCB.isSelected()};
    }

    private void setFlags(boolean[] tab) {
        ContactCB.setSelected(tab[0]);
        ChargeCB.setSelected(tab[1]);
        RechargeCB.setSelected(tab[2]);
        BlockCB.setSelected(tab[3]);
        ReflectCB.setSelected(tab[4]);
        SnachCB.setSelected(tab[5]);
        OHKOCB.setSelected(tab[6]);
        MirrorCB.setSelected(tab[7]);
        GravityCB.setSelected(tab[8]);
        DefrostCB.setSelected(tab[9]);
        HealCB.setSelected(tab[10]);
        IgnoreSubCB.setSelected(tab[11]);
        MentalCB.setSelected(tab[12]);
        CritCB.setSelected(tab[13]);
        BallCB.setSelected(tab[14]);
        PunchCB.setSelected(tab[15]);
        SoundCB.setSelected(tab[16]);
        PowderCB.setSelected(tab[17]);
        JawCB.setSelected(tab[18]);
        PulseCB.setSelected(tab[19]);
        SpecialCB.setSelected(tab[20]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        NameDisplayTF = new javax.swing.JTextField();
        SaveBt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        NameTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TypeOneCB = new javax.swing.JComboBox();
        TypeTwoCB = new javax.swing.JComboBox();
        AtkTypeCB = new javax.swing.JComboBox();
        BPSp = new javax.swing.JSpinner();
        AccuracySp = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        PPCB = new javax.swing.JComboBox();
        TargetCB = new javax.swing.JComboBox();
        PriorSp = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        StatusCB = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        StChanceSp = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        StUserCB = new javax.swing.JCheckBox();
        AtkSp = new javax.swing.JSpinner();
        DefSp = new javax.swing.JSpinner();
        SpASp = new javax.swing.JSpinner();
        SpDSp = new javax.swing.JSpinner();
        SpeSp = new javax.swing.JSpinner();
        EvsSp = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        StatsUserCB = new javax.swing.JCheckBox();
        AccSp = new javax.swing.JSpinner();
        StatsChanceSp = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        SwiUserCB = new javax.swing.JCheckBox();
        SwiTargetCB = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        MultiHitSp = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        HPSourceCB = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        HPChangeSp = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        SuperEffCB = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ContactCB = new javax.swing.JCheckBox();
        ChargeCB = new javax.swing.JCheckBox();
        RechargeCB = new javax.swing.JCheckBox();
        BlockCB = new javax.swing.JCheckBox();
        ReflectCB = new javax.swing.JCheckBox();
        SnachCB = new javax.swing.JCheckBox();
        MirrorCB = new javax.swing.JCheckBox();
        PunchCB = new javax.swing.JCheckBox();
        SoundCB = new javax.swing.JCheckBox();
        PowderCB = new javax.swing.JCheckBox();
        JawCB = new javax.swing.JCheckBox();
        PulseCB = new javax.swing.JCheckBox();
        BallCB = new javax.swing.JCheckBox();
        GravityCB = new javax.swing.JCheckBox();
        DefrostCB = new javax.swing.JCheckBox();
        HealCB = new javax.swing.JCheckBox();
        IgnoreSubCB = new javax.swing.JCheckBox();
        MentalCB = new javax.swing.JCheckBox();
        OHKOCB = new javax.swing.JCheckBox();
        CritCB = new javax.swing.JCheckBox();
        SpecialCB = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescriptionTA = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        TMCB = new javax.swing.JCheckBox();
        TMNumCB = new javax.swing.JSpinner();
        jPanel5 = new javax.swing.JPanel();
        IfMissedCB = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        HPLossSp = new javax.swing.JSpinner();
        StMissUserCB = new javax.swing.JCheckBox();
        StatusMissCB = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        SpAMissSp = new javax.swing.JSpinner();
        StatsMissUserCB = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        SpeMissSp = new javax.swing.JSpinner();
        EvanMissSp = new javax.swing.JSpinner();
        AtkMissSp = new javax.swing.JSpinner();
        DefMissSp = new javax.swing.JSpinner();
        SpDMissSp = new javax.swing.JSpinner();
        AccMissSp = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        SwiMissUser = new javax.swing.JCheckBox();
        SwiMissTarget = new javax.swing.JCheckBox();
        MoveListCB = new javax.swing.JComboBox();
        NewBt = new javax.swing.JButton();
        LoadBt = new javax.swing.JButton();
        SortBt = new javax.swing.JButton();
        DeleteBt = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        NameDisplayTF.setFont(new java.awt.Font("MS UI Gothic", 0, 13)); // NOI18N
        NameDisplayTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NameDisplayTF.setText("---New---");
        NameDisplayTF.setToolTipText("");
        NameDisplayTF.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createEtchedBorder()));
        NameDisplayTF.setFocusable(false);

        SaveBt.setText("Save");
        SaveBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Name:");

        TypeOneCB.setModel(new javax.swing.DefaultComboBoxModel(TypeChecker.type));

        TypeTwoCB.setModel(new javax.swing.DefaultComboBoxModel(TypeChecker.type));

        AtkTypeCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Physical", "Special", "Status" }));

        BPSp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 300, 1));

        AccuracySp.setModel(new javax.swing.SpinnerNumberModel(100, 0, 100, 1));

        jLabel4.setText("%");

        PPCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "5", "10", "15", "20", "25", "30", "35", "40" }));
        PPCB.setSelectedIndex(4);

        TargetCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selected Target", "All Opponents", "User" }));

        PriorSp.setModel(new javax.swing.SpinnerNumberModel(0, -7, 5, 1));

        jLabel7.setText("Type:");

        jLabel2.setText("BP:");

        jLabel3.setText("Accuracy:");

        jLabel5.setText("PP:");

        jLabel6.setText("Target:");

        jLabel8.setText("Priority:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PriorSp, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TargetCB, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PPCB, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(AtkTypeCB, javax.swing.GroupLayout.Alignment.LEADING, 0, 85, Short.MAX_VALUE)
                                            .addComponent(TypeOneCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TypeTwoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(BPSp, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AccuracySp, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(NameTF))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeOneCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TypeTwoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AtkTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BPSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccuracySp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PPCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TargetCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriorSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        StatusCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Paralysis", "Sleep", "Freeze", "Burn", "Poison", "Toxic", "Confusion", "Flinch" }));

        jLabel9.setText("Status:");

        StChanceSp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel10.setText("%");

        StUserCB.setText("User");

        AtkSp.setModel(new javax.swing.SpinnerNumberModel(0, -6, 6, 1));
        AtkSp.setToolTipText("Atk");

        DefSp.setModel(new javax.swing.SpinnerNumberModel(0, -6, 6, 1));
        DefSp.setToolTipText("Def");

        SpASp.setModel(new javax.swing.SpinnerNumberModel(0, -6, 6, 1));
        SpASp.setToolTipText("SpA");

        SpDSp.setModel(new javax.swing.SpinnerNumberModel(0, -6, 6, 1));
        SpDSp.setToolTipText("SpD");

        SpeSp.setModel(new javax.swing.SpinnerNumberModel(0, -6, 6, 1));
        SpeSp.setToolTipText("Spe");

        EvsSp.setModel(new javax.swing.SpinnerNumberModel(0, -6, 6, 1));
        EvsSp.setToolTipText("Evansion");

        jLabel12.setText("Stats:");

        StatsUserCB.setText("User");

        AccSp.setModel(new javax.swing.SpinnerNumberModel(0, -6, 6, 1));
        AccSp.setToolTipText("Accuracy");

        StatsChanceSp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel13.setText("%");

        SwiUserCB.setText("User");

        SwiTargetCB.setText("Target");

        jLabel15.setText("Switch:");

        MultiHitSp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel16.setText("Multi-Hit:");

        HPSourceCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "User's HP", "Dealt Damage" }));

        jLabel17.setText("HP Change:");

        HPChangeSp.setModel(new javax.swing.SpinnerNumberModel(0, -100, 100, 1));

        jLabel18.setText("% of");

        SuperEffCB.setModel(new javax.swing.DefaultComboBoxModel(TypeChecker.type));

        jLabel19.setText("Good Against:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(AtkSp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DefSp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpASp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SuperEffCB, 0, 109, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpDSp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpeSp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EvsSp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AccSp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StUserCB)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(StatusCB, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StChanceSp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(StatsChanceSp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(StatsUserCB))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SwiUserCB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SwiTargetCB))
                            .addComponent(MultiHitSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(HPChangeSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HPSourceCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatusCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(StChanceSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StUserCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AtkSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DefSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpASp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpDSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpeSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EvsSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(AccSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatsChanceSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(StatsUserCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SwiUserCB)
                    .addComponent(SwiTargetCB)
                    .addComponent(jLabel15))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MultiHitSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HPSourceCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(HPChangeSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SuperEffCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ContactCB.setText("Makes contact");

        ChargeCB.setText("Charging turn");

        RechargeCB.setText("Must recharge");

        BlockCB.setText("Blocked by Protect");

        ReflectCB.setText("Reflectable");

        SnachCB.setText("Snachable");

        MirrorCB.setText("Copied by Mirror Move");

        PunchCB.setText("Punch-based");

        SoundCB.setText("Sound-based");

        PowderCB.setText("Powder-based");

        JawCB.setText("Jaw-based");

        PulseCB.setText("Pulse-based");

        BallCB.setText("Ballistics-based");

        GravityCB.setText("Unusable during Gravity");

        DefrostCB.setText("Defrosts when used");

        HealCB.setText("Heals");

        IgnoreSubCB.setText("Ignores Substitute");

        MentalCB.setText("Mental effects");

        OHKOCB.setText("One-hit KO");

        CritCB.setText("High Critical hit chance");

        SpecialCB.setText("\"Special\" effect");
        SpecialCB.setToolTipText("Move's effect is implemented in the code");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContactCB)
                    .addComponent(ChargeCB)
                    .addComponent(RechargeCB)
                    .addComponent(BlockCB)
                    .addComponent(ReflectCB)
                    .addComponent(SnachCB)
                    .addComponent(OHKOCB))
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MentalCB)
                    .addComponent(IgnoreSubCB)
                    .addComponent(HealCB)
                    .addComponent(DefrostCB)
                    .addComponent(GravityCB)
                    .addComponent(MirrorCB)
                    .addComponent(CritCB))
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SpecialCB)
                    .addComponent(BallCB)
                    .addComponent(PunchCB)
                    .addComponent(PowderCB)
                    .addComponent(JawCB)
                    .addComponent(SoundCB)
                    .addComponent(PulseCB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ContactCB)
                            .addComponent(MirrorCB)
                            .addComponent(BallCB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChargeCB)
                            .addComponent(GravityCB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RechargeCB)
                            .addComponent(DefrostCB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BlockCB)
                            .addComponent(HealCB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ReflectCB)
                            .addComponent(IgnoreSubCB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SnachCB)
                            .addComponent(MentalCB)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(PunchCB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SoundCB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PowderCB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JawCB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PulseCB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OHKOCB)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CritCB)
                        .addComponent(SpecialCB)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setAutoscrolls(true);

        DescriptionTA.setColumns(20);
        DescriptionTA.setRows(5);
        jScrollPane1.setViewportView(DescriptionTA);

        jLabel20.setText("Description:");

        TMCB.setText("TM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(TMCB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TMNumCB, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TMCB)
                    .addComponent(TMNumCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        IfMissedCB.setText("\"If attack missed\" effect");

        jLabel22.setText("% of User's HP");

        jLabel21.setText("HP Change:");

        HPLossSp.setModel(new javax.swing.SpinnerNumberModel(0, -100, 100, 1));

        StMissUserCB.setText("User");

        StatusMissCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Paralysis", "Sleep", "Freeze", "Burn", "Poison", "Toxic", "Confusion", "Flinch" }));

        jLabel23.setText("Status:");

        SpAMissSp.setModel(new javax.swing.SpinnerNumberModel(0, -6, 6, 1));
        SpAMissSp.setToolTipText("SpA");

        StatsMissUserCB.setText("User");

        jLabel25.setText("Stats:");

        SpeMissSp.setModel(new javax.swing.SpinnerNumberModel(0, -6, 6, 1));
        SpeMissSp.setToolTipText("Spe");

        EvanMissSp.setModel(new javax.swing.SpinnerNumberModel(0, -6, 6, 1));
        EvanMissSp.setToolTipText("Evansion");

        AtkMissSp.setModel(new javax.swing.SpinnerNumberModel(0, -6, 6, 1));
        AtkMissSp.setToolTipText("Atk");

        DefMissSp.setModel(new javax.swing.SpinnerNumberModel(0, -6, 6, 1));
        DefMissSp.setToolTipText("Def");

        SpDMissSp.setModel(new javax.swing.SpinnerNumberModel(0, -6, 6, 1));
        SpDMissSp.setToolTipText("SpD");

        AccMissSp.setModel(new javax.swing.SpinnerNumberModel(0, -6, 6, 1));
        AccMissSp.setToolTipText("Accuracy");

        jLabel26.setText("Switch:");

        SwiMissUser.setText("User");

        SwiMissTarget.setText("Target");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StatusMissCB, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StMissUserCB))
                    .addComponent(IfMissedCB)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HPLossSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(AtkMissSp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DefMissSp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpAMissSp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpDMissSp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpeMissSp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EvanMissSp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AccMissSp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(StatsMissUserCB))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SwiMissUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SwiMissTarget)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IfMissedCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(HPLossSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StMissUserCB)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(StatusMissCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AtkMissSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DefMissSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpAMissSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpDMissSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpeMissSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EvanMissSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(AccMissSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StatsMissUserCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SwiMissUser)
                    .addComponent(SwiMissTarget)
                    .addComponent(jLabel26))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MoveListCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        NewBt.setText("New");
        NewBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBtActionPerformed(evt);
            }
        });

        LoadBt.setText("Load");
        LoadBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadBtActionPerformed(evt);
            }
        });

        SortBt.setText("Sort");
        SortBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortBtActionPerformed(evt);
            }
        });

        DeleteBt.setText("Delete");
        DeleteBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameDisplayTF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SaveBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MoveListCB, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LoadBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SortBt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameDisplayTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveBt)
                    .addComponent(MoveListCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewBt)
                    .addComponent(LoadBt)
                    .addComponent(SortBt)
                    .addComponent(DeleteBt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtActionPerformed
        NameDisplayTF.setText(NameTF.getText());
        index.addMove(new MoveBase(NameTF.getText(), new String[]{TypeOneCB.getSelectedItem().toString(), TypeTwoCB.getSelectedItem().toString()},
                AtkTypeCB.getSelectedItem().toString(), BPSp.getValue().hashCode(), AccuracySp.getValue().hashCode(), Integer.parseInt(PPCB.getSelectedItem().toString()),
                TargetCB.getSelectedItem().toString(), PriorSp.getValue().hashCode(), StatusCB.getSelectedItem().toString(), StChanceSp.getValue().hashCode(),
                StUserCB.isSelected(), new int[]{AtkSp.getValue().hashCode(), DefSp.getValue().hashCode(), SpASp.getValue().hashCode(),
                    SpDSp.getValue().hashCode(), SpeSp.getValue().hashCode(), EvsSp.getValue().hashCode(), AccSp.getValue().hashCode()}, StatsChanceSp.getValue().hashCode(),
                StatsUserCB.isSelected(), SwiUserCB.isSelected() || SwiTargetCB.isSelected(), SwiUserCB.isSelected(), MultiHitSp.getValue().hashCode(), HPChangeSp.getValue().hashCode(),
                HPSourceCB.getSelectedItem().toString(), SuperEffCB.getSelectedItem().toString(), flags(), DescriptionTA.getText(), TMCB.isSelected(), TMNumCB.getValue().hashCode(), IfMissedCB.isSelected(),
                HPLossSp.getValue().hashCode(), StatusMissCB.getSelectedItem().toString(), StMissUserCB.isSelected(), new int[]{AtkMissSp.getValue().hashCode(), DefMissSp.getValue().hashCode(),
                    SpAMissSp.getValue().hashCode(), SpDMissSp.getValue().hashCode(), SpeMissSp.getValue().hashCode(), EvanMissSp.getValue().hashCode(), AccMissSp.getValue().hashCode()},
                StatsMissUserCB.isSelected(), SwiMissUser.isSelected() || SwiMissTarget.isSelected(), SwiMissUser.isSelected()));

        repaint();
    }//GEN-LAST:event_SaveBtActionPerformed

    private void LoadBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadBtActionPerformed
        if (PokeMaker.question("Are you sure?")) {
            MoveBase load = (MoveBase) MoveListCB.getSelectedItem();

            NameDisplayTF.setText(load.getName());
            NameTF.setText(load.getName());
            TypeOneCB.setSelectedItem(load.getType(1));
            TypeTwoCB.setSelectedItem(load.getType(2));
            AtkTypeCB.setSelectedItem(load.getAtkType());
            BPSp.setValue(load.getBp());
            AccuracySp.setValue(load.getAccuracy());
            PPCB.setSelectedItem(load.getPp());
            TargetCB.setSelectedItem(load.getTarget());
            PriorSp.setValue(load.getPriority());
            StatusCB.setSelectedItem(load.getStatus());
            StChanceSp.setValue(load.getStatsChance());
            StUserCB.setSelected(load.isStatusUser());
            AtkSp.setValue(load.getStats(1));
            DefSp.setValue(load.getStats(2));
            SpASp.setValue(load.getStats(3));
            SpDSp.setValue(load.getStats(4));
            SpeSp.setValue(load.getStats(5));
            EvsSp.setValue(load.getStats(6));
            AccSp.setValue(load.getStats(7));
            StatsChanceSp.setValue(load.getStatsChance());
            StatsUserCB.setSelected(load.isStatsUser());
            SwiUserCB.setSelected(load.isIfSwitch() && load.isSwitchUser());
            SwiTargetCB.setSelected(load.isIfSwitch() && !load.isSwitchUser());
            MultiHitSp.setValue(load.getMultiHit());
            HPChangeSp.setValue(load.getHpChange());
            HPSourceCB.setSelectedItem(load.getHpSource());
            SuperEffCB.setSelectedItem(load.getSuperType());
            setFlags(load.getFlags());
            DescriptionTA.setText(load.getDescription());
            TMCB.setSelected(load.isIfTM());
            TMNumCB.setValue(load.getTMnum());

            if (load.isIfMissed()) {
                IfMissedCB.setSelected(true);
                HPLossSp.setValue(load.getMissedHpChange());
                StatusMissCB.setSelectedItem(load.getMissedStatus());
                StMissUserCB.setSelected(load.isMissedStatusUser());
                AtkMissSp.setValue(load.getMissedStats(1));
                DefMissSp.setValue(load.getMissedStats(2));
                SpAMissSp.setValue(load.getMissedStats(3));
                SpDMissSp.setValue(load.getMissedStats(4));
                SpeMissSp.setValue(load.getMissedStats(5));
                EvanMissSp.setValue(load.getMissedStats(6));
                AccMissSp.setValue(load.getMissedStats(7));
                StatsMissUserCB.setSelected(load.isMissedStatsUser());
                SwiMissUser.setSelected(load.isMissedSwitch() && load.isMissedSwitchUser());
                SwiMissTarget.setSelected(load.isMissedSwitch() && !load.isMissedSwitchUser());
            } else {
                IfMissedCB.setSelected(false);
                HPLossSp.setValue(0);
                StatusMissCB.setSelectedIndex(0);
                StMissUserCB.setSelected(false);
                AtkMissSp.setValue(0);
                DefMissSp.setValue(0);
                SpAMissSp.setValue(0);
                SpDMissSp.setValue(0);
                SpeMissSp.setValue(0);
                EvanMissSp.setValue(0);
                AccMissSp.setValue(0);
                StatsMissUserCB.setSelected(false);
                SwiMissUser.setSelected(false);
                SwiMissTarget.setSelected(false);
            }
            repaint();
        }
    }//GEN-LAST:event_LoadBtActionPerformed

    private void NewBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBtActionPerformed
        if (PokeMaker.question("Are you sure?")) {
            NameDisplayTF.setText("---New---");
            NameTF.setText("");
            TypeOneCB.setSelectedItem("");
            TypeTwoCB.setSelectedItem("");
            AtkTypeCB.setSelectedIndex(0);
            BPSp.setValue(0);
            AccuracySp.setValue(100);
            PPCB.setSelectedIndex(4);
            TargetCB.setSelectedIndex(0);
            PriorSp.setValue(0);
            StatusCB.setSelectedIndex(0);
            StChanceSp.setValue(0);
            StUserCB.setSelected(false);
            AtkSp.setValue(0);
            DefSp.setValue(0);
            SpASp.setValue(0);
            SpDSp.setValue(0);
            SpeSp.setValue(0);
            EvsSp.setValue(0);
            AccSp.setValue(0);
            StatsChanceSp.setValue(0);
            StatsUserCB.setSelected(false);
            SwiUserCB.setSelected(false);
            SwiTargetCB.setSelected(false);
            MultiHitSp.setValue(0);
            HPChangeSp.setValue(0);
            HPSourceCB.setSelectedIndex(0);
            SuperEffCB.setSelectedIndex(0);
            setFlags(new boolean[]{false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false, false, false});
            DescriptionTA.setText("");
            TMCB.setSelected(false);
            TMNumCB.setValue(0);
            IfMissedCB.setSelected(false);
            HPLossSp.setValue(0);
            StatusMissCB.setSelectedIndex(0);
            StMissUserCB.setSelected(false);
            AtkMissSp.setValue(0);
            DefMissSp.setValue(0);
            SpAMissSp.setValue(0);
            SpDMissSp.setValue(0);
            SpeMissSp.setValue(0);
            EvanMissSp.setValue(0);
            AccMissSp.setValue(0);
            StatsMissUserCB.setSelected(false);
            SwiMissUser.setSelected(false);
            SwiMissTarget.setSelected(false);
            repaint();
        }
    }//GEN-LAST:event_NewBtActionPerformed

    private void DeleteBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtActionPerformed
        index.deleteMove((MoveBase) MoveListCB.getSelectedItem());
        repaint();
    }//GEN-LAST:event_DeleteBtActionPerformed

    private void SortBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortBtActionPerformed
        index.sortDexNumber();
        repaint();
    }//GEN-LAST:event_SortBtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner AccMissSp;
    private javax.swing.JSpinner AccSp;
    private javax.swing.JSpinner AccuracySp;
    private javax.swing.JSpinner AtkMissSp;
    private javax.swing.JSpinner AtkSp;
    private javax.swing.JComboBox AtkTypeCB;
    private javax.swing.JSpinner BPSp;
    private javax.swing.JCheckBox BallCB;
    private javax.swing.JCheckBox BlockCB;
    private javax.swing.JCheckBox ChargeCB;
    private javax.swing.JCheckBox ContactCB;
    private javax.swing.JCheckBox CritCB;
    private javax.swing.JSpinner DefMissSp;
    private javax.swing.JSpinner DefSp;
    private javax.swing.JCheckBox DefrostCB;
    private javax.swing.JButton DeleteBt;
    private javax.swing.JTextArea DescriptionTA;
    private javax.swing.JSpinner EvanMissSp;
    private javax.swing.JSpinner EvsSp;
    private javax.swing.JCheckBox GravityCB;
    private javax.swing.JSpinner HPChangeSp;
    private javax.swing.JSpinner HPLossSp;
    private javax.swing.JComboBox HPSourceCB;
    private javax.swing.JCheckBox HealCB;
    private javax.swing.JCheckBox IfMissedCB;
    private javax.swing.JCheckBox IgnoreSubCB;
    private javax.swing.JCheckBox JawCB;
    private javax.swing.JButton LoadBt;
    private javax.swing.JCheckBox MentalCB;
    private javax.swing.JCheckBox MirrorCB;
    private javax.swing.JComboBox MoveListCB;
    private javax.swing.JSpinner MultiHitSp;
    private javax.swing.JTextField NameDisplayTF;
    private javax.swing.JTextField NameTF;
    private javax.swing.JButton NewBt;
    private javax.swing.JCheckBox OHKOCB;
    private javax.swing.JComboBox PPCB;
    private javax.swing.JCheckBox PowderCB;
    private javax.swing.JSpinner PriorSp;
    private javax.swing.JCheckBox PulseCB;
    private javax.swing.JCheckBox PunchCB;
    private javax.swing.JCheckBox RechargeCB;
    private javax.swing.JCheckBox ReflectCB;
    private javax.swing.JButton SaveBt;
    private javax.swing.JCheckBox SnachCB;
    private javax.swing.JButton SortBt;
    private javax.swing.JCheckBox SoundCB;
    private javax.swing.JSpinner SpAMissSp;
    private javax.swing.JSpinner SpASp;
    private javax.swing.JSpinner SpDMissSp;
    private javax.swing.JSpinner SpDSp;
    private javax.swing.JSpinner SpeMissSp;
    private javax.swing.JSpinner SpeSp;
    private javax.swing.JCheckBox SpecialCB;
    private javax.swing.JSpinner StChanceSp;
    private javax.swing.JCheckBox StMissUserCB;
    private javax.swing.JCheckBox StUserCB;
    private javax.swing.JSpinner StatsChanceSp;
    private javax.swing.JCheckBox StatsMissUserCB;
    private javax.swing.JCheckBox StatsUserCB;
    private javax.swing.JComboBox StatusCB;
    private javax.swing.JComboBox StatusMissCB;
    private javax.swing.JComboBox SuperEffCB;
    private javax.swing.JCheckBox SwiMissTarget;
    private javax.swing.JCheckBox SwiMissUser;
    private javax.swing.JCheckBox SwiTargetCB;
    private javax.swing.JCheckBox SwiUserCB;
    private javax.swing.JCheckBox TMCB;
    private javax.swing.JSpinner TMNumCB;
    private javax.swing.JComboBox TargetCB;
    private javax.swing.JComboBox TypeOneCB;
    private javax.swing.JComboBox TypeTwoCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
