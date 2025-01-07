<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Requerido por el Diseñador de Windows Forms
    Private components As System.ComponentModel.IContainer

    'NOTA: el Diseñador de Windows Forms necesita el siguiente procedimiento
    'Se puede modificar usando el Diseñador de Windows Forms.  
    'No lo modifique con el editor de código.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form1))
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.Mins = New System.Windows.Forms.Label()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Secs = New System.Windows.Forms.Label()
        Me.Decs = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Timer1 = New System.Windows.Forms.Timer(Me.components)
        Me.btnIniciar = New System.Windows.Forms.Button()
        Me.btnPausar = New System.Windows.Forms.Button()
        Me.btnDetener = New System.Windows.Forms.Button()
        Me.parciales = New System.Windows.Forms.ListBox()
        Me.BtnCerrar = New System.Windows.Forms.Button()
        Me.BtnMinimizar = New System.Windows.Forms.Button()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'PictureBox1
        '
        Me.PictureBox1.BackColor = System.Drawing.Color.Transparent
        Me.PictureBox1.Image = CType(resources.GetObject("PictureBox1.Image"), System.Drawing.Image)
        Me.PictureBox1.Location = New System.Drawing.Point(12, 25)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(641, 601)
        Me.PictureBox1.TabIndex = 1
        Me.PictureBox1.TabStop = False
        '
        'Mins
        '
        Me.Mins.AutoSize = True
        Me.Mins.BackColor = System.Drawing.SystemColors.ControlLightLight
        Me.Mins.Font = New System.Drawing.Font("Algerian", 36.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Mins.Location = New System.Drawing.Point(157, 303)
        Me.Mins.Name = "Mins"
        Me.Mins.Size = New System.Drawing.Size(81, 54)
        Me.Mins.TabIndex = 2
        Me.Mins.Text = "00"
        Me.Mins.TextAlign = System.Drawing.ContentAlignment.TopCenter
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.BackColor = System.Drawing.SystemColors.ControlLightLight
        Me.Label1.Font = New System.Drawing.Font("Algerian", 36.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(244, 303)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(36, 54)
        Me.Label1.TabIndex = 3
        Me.Label1.Text = ":"
        Me.Label1.TextAlign = System.Drawing.ContentAlignment.BottomCenter
        '
        'Secs
        '
        Me.Secs.AutoSize = True
        Me.Secs.BackColor = System.Drawing.SystemColors.ControlLightLight
        Me.Secs.Font = New System.Drawing.Font("Algerian", 36.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Secs.Location = New System.Drawing.Point(286, 303)
        Me.Secs.Name = "Secs"
        Me.Secs.Size = New System.Drawing.Size(81, 54)
        Me.Secs.TabIndex = 4
        Me.Secs.Text = "00"
        Me.Secs.TextAlign = System.Drawing.ContentAlignment.TopCenter
        '
        'Decs
        '
        Me.Decs.AutoSize = True
        Me.Decs.BackColor = System.Drawing.SystemColors.ControlLightLight
        Me.Decs.Font = New System.Drawing.Font("Algerian", 36.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Decs.Location = New System.Drawing.Point(387, 303)
        Me.Decs.Name = "Decs"
        Me.Decs.Size = New System.Drawing.Size(81, 54)
        Me.Decs.TabIndex = 5
        Me.Decs.Text = "00"
        Me.Decs.TextAlign = System.Drawing.ContentAlignment.TopCenter
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.BackColor = System.Drawing.SystemColors.ControlLightLight
        Me.Label4.Font = New System.Drawing.Font("Algerian", 36.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.Location = New System.Drawing.Point(358, 303)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(36, 54)
        Me.Label4.TabIndex = 6
        Me.Label4.Text = ":"
        Me.Label4.TextAlign = System.Drawing.ContentAlignment.BottomCenter
        '
        'Timer1
        '
        '
        'btnIniciar
        '
        Me.btnIniciar.BackColor = System.Drawing.Color.Transparent
        Me.btnIniciar.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None
        Me.btnIniciar.Cursor = System.Windows.Forms.Cursors.WaitCursor
        Me.btnIniciar.FlatAppearance.BorderColor = System.Drawing.Color.Silver
        Me.btnIniciar.FlatAppearance.BorderSize = 0
        Me.btnIniciar.FlatAppearance.MouseDownBackColor = System.Drawing.Color.Silver
        Me.btnIniciar.FlatAppearance.MouseOverBackColor = System.Drawing.Color.Silver
        Me.btnIniciar.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.btnIniciar.Image = CType(resources.GetObject("btnIniciar.Image"), System.Drawing.Image)
        Me.btnIniciar.Location = New System.Drawing.Point(272, 404)
        Me.btnIniciar.Margin = New System.Windows.Forms.Padding(2)
        Me.btnIniciar.Name = "btnIniciar"
        Me.btnIniciar.RightToLeft = System.Windows.Forms.RightToLeft.Yes
        Me.btnIniciar.Size = New System.Drawing.Size(57, 55)
        Me.btnIniciar.TabIndex = 7
        Me.btnIniciar.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageAboveText
        Me.btnIniciar.UseVisualStyleBackColor = True
        Me.btnIniciar.UseWaitCursor = True
        '
        'btnPausar
        '
        Me.btnPausar.BackColor = System.Drawing.Color.Transparent
        Me.btnPausar.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None
        Me.btnPausar.Cursor = System.Windows.Forms.Cursors.WaitCursor
        Me.btnPausar.FlatAppearance.BorderColor = System.Drawing.Color.Silver
        Me.btnPausar.FlatAppearance.BorderSize = 0
        Me.btnPausar.FlatAppearance.MouseDownBackColor = System.Drawing.Color.Silver
        Me.btnPausar.FlatAppearance.MouseOverBackColor = System.Drawing.Color.Silver
        Me.btnPausar.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.btnPausar.Image = CType(resources.GetObject("btnPausar.Image"), System.Drawing.Image)
        Me.btnPausar.Location = New System.Drawing.Point(382, 404)
        Me.btnPausar.Margin = New System.Windows.Forms.Padding(2)
        Me.btnPausar.Name = "btnPausar"
        Me.btnPausar.RightToLeft = System.Windows.Forms.RightToLeft.Yes
        Me.btnPausar.Size = New System.Drawing.Size(57, 55)
        Me.btnPausar.TabIndex = 8
        Me.btnPausar.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageAboveText
        Me.btnPausar.UseVisualStyleBackColor = True
        Me.btnPausar.UseWaitCursor = True
        '
        'btnDetener
        '
        Me.btnDetener.BackColor = System.Drawing.Color.Transparent
        Me.btnDetener.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None
        Me.btnDetener.Cursor = System.Windows.Forms.Cursors.WaitCursor
        Me.btnDetener.FlatAppearance.BorderColor = System.Drawing.Color.Silver
        Me.btnDetener.FlatAppearance.BorderSize = 0
        Me.btnDetener.FlatAppearance.MouseDownBackColor = System.Drawing.Color.Silver
        Me.btnDetener.FlatAppearance.MouseOverBackColor = System.Drawing.Color.Silver
        Me.btnDetener.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.btnDetener.Image = CType(resources.GetObject("btnDetener.Image"), System.Drawing.Image)
        Me.btnDetener.Location = New System.Drawing.Point(167, 404)
        Me.btnDetener.Margin = New System.Windows.Forms.Padding(2)
        Me.btnDetener.Name = "btnDetener"
        Me.btnDetener.RightToLeft = System.Windows.Forms.RightToLeft.Yes
        Me.btnDetener.Size = New System.Drawing.Size(57, 55)
        Me.btnDetener.TabIndex = 9
        Me.btnDetener.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageAboveText
        Me.btnDetener.UseVisualStyleBackColor = True
        Me.btnDetener.UseWaitCursor = True
        '
        'parciales
        '
        Me.parciales.FormattingEnabled = True
        Me.parciales.Location = New System.Drawing.Point(659, 36)
        Me.parciales.Name = "parciales"
        Me.parciales.Size = New System.Drawing.Size(228, 160)
        Me.parciales.TabIndex = 10
        '
        'BtnCerrar
        '
        Me.BtnCerrar.BackColor = System.Drawing.Color.Transparent
        Me.BtnCerrar.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None
        Me.BtnCerrar.Cursor = System.Windows.Forms.Cursors.WaitCursor
        Me.BtnCerrar.FlatAppearance.BorderColor = System.Drawing.Color.Silver
        Me.BtnCerrar.FlatAppearance.BorderSize = 0
        Me.BtnCerrar.FlatAppearance.MouseDownBackColor = System.Drawing.Color.Silver
        Me.BtnCerrar.FlatAppearance.MouseOverBackColor = System.Drawing.Color.Silver
        Me.BtnCerrar.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.BtnCerrar.Image = CType(resources.GetObject("BtnCerrar.Image"), System.Drawing.Image)
        Me.BtnCerrar.Location = New System.Drawing.Point(531, 174)
        Me.BtnCerrar.Margin = New System.Windows.Forms.Padding(2)
        Me.BtnCerrar.Name = "BtnCerrar"
        Me.BtnCerrar.RightToLeft = System.Windows.Forms.RightToLeft.Yes
        Me.BtnCerrar.Size = New System.Drawing.Size(23, 22)
        Me.BtnCerrar.TabIndex = 11
        Me.BtnCerrar.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageAboveText
        Me.BtnCerrar.UseVisualStyleBackColor = True
        Me.BtnCerrar.UseWaitCursor = True
        '
        'BtnMinimizar
        '
        Me.BtnMinimizar.BackColor = System.Drawing.Color.Transparent
        Me.BtnMinimizar.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None
        Me.BtnMinimizar.Cursor = System.Windows.Forms.Cursors.WaitCursor
        Me.BtnMinimizar.FlatAppearance.BorderColor = System.Drawing.Color.Silver
        Me.BtnMinimizar.FlatAppearance.BorderSize = 0
        Me.BtnMinimizar.FlatAppearance.MouseDownBackColor = System.Drawing.Color.Silver
        Me.BtnMinimizar.FlatAppearance.MouseOverBackColor = System.Drawing.Color.Silver
        Me.BtnMinimizar.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.BtnMinimizar.Image = CType(resources.GetObject("BtnMinimizar.Image"), System.Drawing.Image)
        Me.BtnMinimizar.Location = New System.Drawing.Point(49, 174)
        Me.BtnMinimizar.Margin = New System.Windows.Forms.Padding(2)
        Me.BtnMinimizar.Name = "BtnMinimizar"
        Me.BtnMinimizar.RightToLeft = System.Windows.Forms.RightToLeft.Yes
        Me.BtnMinimizar.Size = New System.Drawing.Size(23, 22)
        Me.BtnMinimizar.TabIndex = 12
        Me.BtnMinimizar.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageAboveText
        Me.BtnMinimizar.UseVisualStyleBackColor = True
        Me.BtnMinimizar.UseWaitCursor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.AutoValidate = System.Windows.Forms.AutoValidate.EnablePreventFocusChange
        Me.ClientSize = New System.Drawing.Size(908, 667)
        Me.Controls.Add(Me.BtnMinimizar)
        Me.Controls.Add(Me.BtnCerrar)
        Me.Controls.Add(Me.parciales)
        Me.Controls.Add(Me.btnDetener)
        Me.Controls.Add(Me.btnPausar)
        Me.Controls.Add(Me.btnIniciar)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Decs)
        Me.Controls.Add(Me.Secs)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.Mins)
        Me.Controls.Add(Me.PictureBox1)
        Me.DoubleBuffered = True
        Me.Name = "Form1"
        Me.Text = "KronoApp"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents Mins As Label
    Friend WithEvents Label1 As Label
    Friend WithEvents Secs As Label
    Friend WithEvents Decs As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Timer1 As Timer
    Friend WithEvents btnIniciar As Button
    Friend WithEvents btnPausar As Button
    Friend WithEvents btnDetener As Button
    Friend WithEvents parciales As ListBox
    Friend WithEvents BtnCerrar As Button
    Friend WithEvents BtnMinimizar As Button
End Class
