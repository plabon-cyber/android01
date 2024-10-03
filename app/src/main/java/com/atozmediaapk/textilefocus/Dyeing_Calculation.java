package com.atozmediaapk.textilefocus;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

public class Dyeing_Calculation extends AppCompatActivity implements RecycleViewOnItemClick {




    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;

    private List<NovelsModel> novelsModels = new ArrayList<>();
    private List<NovelsModel> deletedNovels = new ArrayList<>();
    private List<NovelsModel> archivedNovels = new ArrayList<>();

    private int archivedCounter = 0;
    private int deletedCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dyeing_calculation);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        initNovelsModel();

        recyclerView = findViewById(R.id.main_rv);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerAdapter = new RecyclerAdapter(novelsModels, (RecycleViewOnItemClick) this);
        recyclerView.setAdapter(recyclerAdapter);

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);

    }

    ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(0,
            ItemTouchHelper.LEFT |
                    ItemTouchHelper.RIGHT) {
        @Override
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
            return false;
        }

        @Override
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {


            final int position = viewHolder.getAdapterPosition();
            switch (direction) {
                case ItemTouchHelper.LEFT:
                    deletedNovels.add(position, novelsModels.get(position));
                    novelsModels.remove(position);
                    recyclerAdapter.notifyItemRemoved(position);

                    String deletedNovelsName = deletedNovels.get(deletedCounter).getNovelNames();
                    deletedCounter++;
                    Snackbar.make(recyclerView, deletedNovelsName, Snackbar.LENGTH_LONG)
                            .setAction("Undo", new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    novelsModels.add(position, deletedNovels.get(position));
                                    recyclerAdapter.notifyItemInserted(position);
                                }
                            }).show();
                    break;

                case ItemTouchHelper.RIGHT:
                    archivedNovels.add(novelsModels.get(position));
                    novelsModels.remove(position);
                    recyclerAdapter.notifyItemRemoved(position);
                    String archivedNovelsName = archivedNovels.get(archivedCounter).getNovelNames();
                    archivedCounter++;
                    Snackbar.make(recyclerView, archivedNovelsName + "Archived.", Snackbar.LENGTH_LONG)
                            .setAction("View Archive", new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(Dyeing_Calculation.this, Archived.class);
                                    Parcelable parcelable = Parcels.wrap(archivedNovels);
                                    intent.putExtra("archivedNovels", parcelable);
                                    startActivity(intent);

                                }
                            }).show();
                    break;
            }

        }
    };


    private void initNovelsModel() {

        novelsModels.add(new NovelsModel("Reactive",
                "Dye",
                "\n" +
                        "These dyes react with the the cellulosic fiber to form a covalent bond. " +
                        "This produces dyed fiber with extremely high wash fastness properties. " +
                        "These are the dyeing of fabrics which contain a reactive group which " +
                        "combines directly with the hydroxyle or the amino group of the fiber. " +
                        "Because of the chemical reaction the color is fast and has a very long life. " +
                        "Cotton,wool or slik cal be dyed with this type of dyeing of fabrics." +
                        "there are various types of reactve dyes used in dyeing industry."+
                        "\n\n.", R.drawable.reactiveblue));


        novelsModels.add(new NovelsModel("Acid",
                "Dye",
                "\n" +
                        "Acid dyes are water-soluble anionic dyes, containing one or more sulfonic acid substituent’s or other acidic group."+
                        "An example of the class is Acid Yellow 36."+
                        "Acid dyes are water-soluble anionic dyes that are applied to fibers such as silk,wool,nylon and modified acrylic "+
                        "fibers using neutral to acid dye baths. Acid dyes are not substantive to cellulosic fibers. "+
                        "Most synthetic food colors fall in this category. The dyeing Process is reversible and may be described as follows."+
                        "\n\n....................type missing",

                R.drawable.acid_yellow));

        novelsModels.add(new NovelsModel("Azoic",
                "Dye",
                "\n" +
                        "Azo dyes contain at least one azogroup (-N=N-) attached to one or often two aromatic rings."+
                        "These dyes are used primarily for bright red shades in dyeing and printing since most other"+
                        "classes of fast dyes are lacking in good red dyes. Azoic dyes, called Naphthols in the industry,"+
                        "are actually manufactured in the fabricby applying one half of the dye."+
                        "The other half is then put on and they combine to form the finished color."+
                        "Unless they are carefully applied and well washed, they have poor fastness to rubbing or crocking."+
                        "\n\n.",
                R.drawable.azoic
        ));

        novelsModels.add(new NovelsModel("Direct",
                "Dye",
                "\n" +
                        "These are the dyes which can be applied directly to the fabrics from an aqueous solution."+
                        " These are most useful for fabrics which can form hydrogen bonds with the Dyeing of Fabrics."+
                        "The direct dyes mainly the basic dyes and were widely hailed because they made it unnecessary to use a mordant or binder in dyeingcotton."+
                        "The colors are not as brilliant as those in the basic dyes but they have better fastness to light and washing,"+
                        "and such fastness can be measurably improved by after treatments (diazotized and developed.) "+
                        "Direct dyes can be used on cotton, linen, rayon, wool, silk and nylon."+
                        "These dyes usually have azo linkage —N:N- and high molecular weight."+
                        "They are water soluble because of sulfonic acid groups.Direct orange 26 is a typical direct dye."+
                        "\n\n.",
                R.drawable.dyrect_orange
        ));

        novelsModels.add(new NovelsModel("Basic", "Dye",
                "\n" +
                        "This group was the ﬁrst of the synthetic dyes to be taken out of coal-tar derivatives."+
                        "As textile dyes, they have been largely replaced by later developments."+
                        "They are still used in discharge printing, and for preparing leather, paper,"+
                        "wood, and straw, More recently they have been successfully used with some ready made ﬁbers,especially the acrylics."+
                        "Basic dyes were originally used to color wool,silk, linen, hemp, etc."+
                        "without the use of a mordant, or using agent. With a mordant like tannic acid they were used on cotton and rayon."+
                        "Basic dyes give brilliant colors with exceptional fastness to acrylic fibers."+
                        "They can be used on basic dyeable variants of nylon and polyester."+
                        "Basic Brown 1 is an example of acationic dye that is readily protonated under the pH 2 to 5 conditions of dyeing."+
                        "\n\n.",
                R.drawable.basic_brown));

        novelsModels.add(new NovelsModel("Nitro", "Dye",
                "\n" +
                        "Nitro dyes are polynitro derivatives of phenols containing at least one nitro group ortho or para to the hydroxyl group."+
                        "It is used to dye wool.It Consist of two or more aromatic rings (benzene, naphthalene)."+
                        "\n\n.",
                R.drawable.nitro));

        novelsModels.add(new NovelsModel("Disperse", "Dye",
                "\n" +
                        "Disperse dyes were originally developed for dyeing secondary cellulose acetate ﬁbers."+
                        "These dyes are relatively insoluble in water and are prepared for dyeing by being "+
                        "ground into relatively ﬁne powder in the presence of dispersing agents."+
                        "In the dye bath, a suspension of the dyeparticle dispersion produces a very "+
                        "dilute solution of the dyes, which are then absorbed by the fibers."+
                        "This dye class is used to dye polyester, nylon,acetate and triacetate ﬁbers."+
                        "Disperse yellow 3, Disperse Red 4, and Disperse Blue 27 are good examples of disperse dyes." +
                        "\n\n.",
                R.drawable.disperse_dye
        ));

        novelsModels.add(new NovelsModel("Vat", "Dye",
                "\n" +
                        "The vat dyes are insoluble complex polycyclic molecules based on the quinone structure (ketoforms)."+
                        "The term vat comes from the old indigo method dyeing in a vat: indigo had tobe reduced to light form."+
                        "Vat dyes are made from indigo,anthraquinoneand carbazole. "+
                        "They are successfully used on cotton, linen, rayon, wool,silk, and sometimes nylon."+
                        "Vat dyesare also used in the continuous piece of dyeing process sometimes called the pigment application process."+
                        "Thedyeings produced in this way have high wash and light fastness."+
                        "An example of a vat dye is Vat Blue 4(Indanthrene)." +
                        "\n\n.",
                R.drawable.vat_blue
        ));

        novelsModels.add(new NovelsModel("Mordant", "Dye",
                "\n" +
                        "These Dyeing of Fabrics do not dye the fabric directly but require a binding agent known as mordant."+
                        "The mordant acts as a binding agent between the fibre and the dye."+
                        "Some dyes combine with metal salts (mordanting) to form insoluble colored complexes (lakes)."+
                        "These materials are usually used for thedyeing of cotton, wool or other protein fiber. "+
                        "The metallic precipitate is formed in the fiber producing very fast colors highly resistant"+
                        "to both light and washing."+
                        "\n\n.",
                R.drawable.mordant_red
        ));

        novelsModels.add(new NovelsModel("Solvent", "Dye", "\n" +
                "These dyes are water-insoluble but soluble in alcohols,chlorinated hydrocarbons, or liquid ammonia."+
                "These colours are applied by dissolving in the target, which is invariably a lipid or non—polar solvent."+
                "The Colour Index uses this as a classiﬁcation and naming system."+
                "Each dye is named according to the pattern: — solvent + base colour + number "+
                "They are used for coloring synthetics, plastics, gasoline, oils and waxes." +
                "\n\n.",
                R.drawable.solvent_yellow
        ));

        novelsModels.add(new NovelsModel("Sulfur", "Dye", "\n" +
                "The Sulfur dyes provide very deep shades, which have excellent resistance"+
                "to washing but poor resistance to sunlight. They will dye cotton, linen, "+
                "and rayon, but not brightly. A problem with sulphur dyes especially the black"+
                "colors is that they make the fabric tender, or weaken its structure, so that it breaks easily."+
                "Sulfur dyes are applied to cotton from an alkaline reducing bath with sodium sulﬁde as the reducing agent."+
                "They are low cost and have good fastness to light, washings and acids."+
                "\n\n.",
                R.drawable.sulfur_red
        ));

    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(Dyeing_Calculation.this, Showmore.class);

        intent.putExtra("book_images", novelsModels.get(position).getNovelImage());

        intent.putExtra("book_intros", novelsModels.get(position).getNovelIntros());

        startActivity(intent);
    }

    @Override
    public void onLongItemClick(int position) {

        novelsModels.remove(position);
        recyclerAdapter.notifyItemRemoved(position);
    }
}