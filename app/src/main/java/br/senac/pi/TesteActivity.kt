package br.senac.pi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import br.senac.pi.databinding.ActivityBottomNavigationBinding
import br.senac.pi.databinding.ActivityTesteBinding
import br.senac.pi.databinding.ActivityToolbarMenuBinding
import br.senac.pi.databinding.FragmentPlaylistBinding
import br.senac.pi.fragments.AlbumsFragment
import br.senac.pi.fragments.ArtistsFragment
import br.senac.pi.fragments.PlaylistFragment
import br.senac.pi.fragments.RecentsFragment

class TesteActivity : AppCompatActivity() {

    lateinit var binding: ActivityTesteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTesteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbarmenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.artistas -> {
                val frag = ArtistsFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
            }
            R.id.albuns -> {
                val frag = AlbumsFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
            }
            R.id.playlist -> {
                val frag = PlaylistFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
            }
            else -> {
                val frag = RecentsFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}

