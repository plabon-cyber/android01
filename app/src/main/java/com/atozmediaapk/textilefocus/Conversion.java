package com.atozmediaapk.textilefocus;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Conversion extends AppCompatActivity {
    //SearchView searchView;

    int[]images ={R.drawable.yarn,R.drawable.length1,R.drawable.area,
            R.drawable.volume,R.drawable.balance,
            R.drawable.time,R.drawable.ic_baseline_apps_24,
            R.drawable.compress,R.drawable.energy,R.drawable.temp};
String[]texts={"Yarn Count","Length","Area","Volume","Weight","Time","CFT Calculation","Pressure","Energy","Temperature"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        // searchView=(SearchView)findViewById(R.id.search);
        ListView listView = findViewById(R.id.list);
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),images,texts);
        listView.setAdapter(customAdapter);

       /* List<String> list = new ArrayList<>();

        list.add("Temperature");
        list.add("Length");
        list.add("Area");
        list.add("Volume");
        list.add("Weight");
        list.add("Time");
        list.add("CFT Calculation");
        list.add("Pressure");
        list.add("Energy");
        list.add("Yarn Count");




        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);


       /* searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });*/

        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                    startActivity(new Intent(Conversion.this, Converter.class));

                } else if (position == 1) {
                    startActivity(new Intent(Conversion.this, LengthActivity.class));

                } else if (position == 2) {
                    startActivity(new Intent(Conversion.this, Area.class));
                }


                else if (position == 3) {
                    startActivity(new Intent(Conversion.this, Volume.class));
                }

                else if (position == 4) {
                    startActivity(new Intent(Conversion.this, Weight.class));
                }

                else if (position == 5) {
                    startActivity(new Intent(Conversion.this, Time.class));
                }

                else if (position == 6) {
                    startActivity(new Intent(Conversion.this, CFT_Calculation.class));
                }

                else if (position == 7) {
                    startActivity(new Intent(Conversion.this, Pressure.class));
                }

                else if (position == 8) {
                    startActivity(new Intent(Conversion.this, Energy.class));
                }

                else if (position == 9) {
                    startActivity(new Intent(Conversion.this, YarnCount.class));
                }




            }
        });*/




    }
    class CustomAdapter extends BaseAdapter {
        Context context;
        int[]images;
        String[]texts;
        LayoutInflater inflater;

        public CustomAdapter (Context context,int[]images,String[]texts){
            this.context=context;
            this.images=images;
            this.texts=texts;
            inflater=(LayoutInflater.from(getApplicationContext()));
        }

        @Override
        public int getCount() {
            return texts.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @SuppressLint("ViewHolder")
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.coustom_list,null);
            ImageView imageView=convertView.findViewById(R.id.cousimage);
            TextView textView=convertView.findViewById(R.id.text_view);

            imageView.setImageResource(images[position]);
            textView.setText(texts[position]);


            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (position == 0) {

                        startActivity(new Intent(Conversion.this, YarnCount.class));

                    } else if (position == 1) {
                        startActivity(new Intent(Conversion.this, LengthActivity.class));

                    } else if (position == 2) {
                        startActivity(new Intent(Conversion.this, Area.class));
                    }


                    else if (position == 3) {
                        startActivity(new Intent(Conversion.this, Volume.class));
                    }

                    else if (position == 4) {
                        startActivity(new Intent(Conversion.this, Weight.class));
                    }

                    else if (position == 5) {
                        startActivity(new Intent(Conversion.this, Time.class));
                    }

                    else if (position == 6) {
                        startActivity(new Intent(Conversion.this, CFT_Calculation.class));
                    }

                    else if (position == 7) {
                        startActivity(new Intent(Conversion.this, Pressure.class));
                    }

                    else if (position == 8) {
                        startActivity(new Intent(Conversion.this, Energy.class));
                    }

                    else if (position == 9) {
                        startActivity(new Intent(Conversion.this, Converter.class));
                    }

                }
            });
            return convertView;
        }
    }
}