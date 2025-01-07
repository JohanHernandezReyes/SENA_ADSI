

Public Class Form1

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
       Me.Cursor = cursors.Hand
       Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None
       Me.BackColor=System.Drawing.Color.White
       Me.TransparencyKey = System.Drawing.Color.Transparent
       Me.parciales.Visible = False
    End Sub

    'Para mover el cronometro sin fondo'
    Dim px, py As Integer
    Dim Mover As Boolean 

    Private Sub PictureBox1_MouseDown (sender As Object, e As MouseEventArgs) Handles PictureBox1.MouseDown
        px = e.X
        py = e.Y
        Mover = True
    End Sub

    Private Sub PictureBox1_MouseUp (sender As Object, e As MouseEventArgs) Handles PictureBox1.MouseUp
        Mover = False
    End Sub

    Private Sub PictureBox1_MouseMove (sender As Object, e As MouseEventArgs) Handles PictureBox1.MouseMove
        If Mover Then
            Me.Location = Me.PointToScreen(New Point(Me.MousePosition.X - Me.Location.X - px, Me.MousePosition.Y - Me.Location.Y - py))
        End If
    End Sub

    Private Sub Timer1_Tick(sender As Object, e As EventArgs) Handles Timer1.Tick

        Decs.Text += 1

        If Decs.Text = 10 Then
            Decs.Text = 0
            Secs.Text += 1

        End If

        If Secs.Text = 60 Then
            Secs.Text = 0
            Mins.Text += 1

        End If

        If Mins.Text = 60 Then
            Mins.Text = 0

        End If
    End Sub

    Private Sub btnIniciar_Click(sender As Object, e As EventArgs) Handles btnIniciar.Click
        Timer1.Start()

    End Sub

    Private Sub btnPausar_Click(sender As Object, e As EventArgs) Handles btnPausar.Click
        Timer1.Stop()
    End Sub

    Private Sub btnGuardar_Click(sender As Object, e As EventArgs) Handles btnGuardar.Click
        parciales.Items.Add(Mins.Text & " Minutos, " & Secs.Text & " Segundos, " & Decs.Text & " Decisegundos")
    End Sub

    Private Sub btnHistorial_Click(sender As Object, e As EventArgs) Handles btnHistorial.Click
        If parciales.Visible = False Then
            parciales.Visible = True
        Else
            parciales.Visible = False
        End If
    End Sub


    Private Sub btnDetener_Click(sender As Object, e As EventArgs) Handles btnDetener.Click
        Timer1.Stop()

        Decs.Text = "00"
        Secs.Text = "00"
        Mins.Text = "00"

        parciales.Items.Clear()

    End Sub

    Private Sub BtnCerrar_Click(sender As Object, e As EventArgs) Handles BtnCerrar.Click
        If MsgBox("Está seguro de cerrar la aplicación?", vbQuestion + vbYesNo + vbDefaultButton2, "Cerrar") = vbYes Then
            Me.Close()
        End If
    End Sub


    Private Sub BtnMinimizar_Click(sender As Object, e As EventArgs) Handles BtnMinimizar.Click
        Me.WindowState = FormWindowState.Minimized
    End Sub

End Class
