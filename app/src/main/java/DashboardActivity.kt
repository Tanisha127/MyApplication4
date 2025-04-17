class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val accessoriesLayout = findViewById<LinearLayout>(R.id.accessoriesLayout)
        accessoriesLayout.setOnClickListener {
            val intent = Intent(this, AccessoriesActivity::class.java)
            startActivity(intent)
        }
    }
}
