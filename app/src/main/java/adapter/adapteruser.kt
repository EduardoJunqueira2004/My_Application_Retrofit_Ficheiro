package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import api.User
import com.example.my_application_retrofit_ficheiro.R

class UserAdapter(private val userList: List<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    // Define o ViewHolder para a RecyclerView
    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userName: TextView = itemView.findViewById(R.id.text1)
        val userCompany: TextView = itemView.findViewById(R.id.text2)
        val userCity: TextView = itemView.findViewById(R.id.text3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        // Inflando o layout do item para o ViewHolder
        val view = LayoutInflater.from(parent.context).inflate(R.layout.linha, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        // Vincula os dados do usuário aos elementos da UI no ViewHolder
        val user = userList[position]
        holder.userName.text = user.name
        holder.userCompany.text = user.email
        holder.userCity.text = user.address.city
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}