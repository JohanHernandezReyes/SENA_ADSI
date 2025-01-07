

Public Class Form1

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Me.btnIniciar.Cursor = Cursors.Hand
        Me.btnPausar.Cursor = Cursors.Hand
        Me.btnDetener.Cursor = Cursors.Hand
        Me.BtnCerrar.Cursor = Cursors.Hand
        Me.BtnMinimizar.Cursor = Cursors.Hand
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
        parciales.Items.Add(Mins.Text & " minutos " & Secs.Text & " segundos " & Decs.Text & " milisegundos")
    End Sub

    Private Sub btnDetener_Click(sender As Object, e As EventArgs) Handles btnDetener.Click
        Timer1.Stop()

        Decs.Text = "00"
        Secs.Text = "00"
        Mins.Text = "00"

        parciales.Items.Clear()

    End Sub

    Private Sub BtnCerrar_Click(sender As Object, e As EventArgs) Handles BtnCerrar.Click
        Me.Close()
    End Sub


    Private Sub BtnMinimizar_Click(sender As Object, e As EventArgs) Handles BtnMinimizar.Click
        Me.WindowState = FormWindowState.Minimized
    End Sub

End Class
