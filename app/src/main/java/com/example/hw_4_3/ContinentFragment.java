package com.example.hw_4_3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.hw_4_3.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements OnitemClick {
    private ContinentAdapter adapter;
    private ArrayList<ContinentModel> continentList = new ArrayList<>();
    private FragmentContinentBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ContinentAdapter(continentList, this);
        binding.continents.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.continents.setAdapter(adapter);
    }

    private void loadData() {
        continentList.add(new ContinentModel("https://thumbs.dreamstime.com/z/%D0%BA%D0%BE%D0%BD%D1%82%D0%B8%D0%BD%D0%B5%D0%BD%D1%82-%D0%B0%D0%B7%D0%B8%D0%B8-%D0%B2-%D0%BA%D0%B0%D1%80%D1%82%D0%B5-%D0%BC%D0%B8%D1%80%D0%B0-108876574.jpg", "Азия"));
        continentList.add(new ContinentModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-cKrPXZ1j-O0tudQjJ0z88JP-g8SgPOPG4w&usqp=CAU", "Европа"));
        continentList.add(new ContinentModel("https://proshina.sch636.edusite.ru/wpimages/wp9129ef31_06.png", "Северная Америка"));
        continentList.add(new ContinentModel("https://polinka.top/uploads/posts/2023-05/1683645703_polinka-top-p-materik-yuzhnaya-amerika-kartinki-vkontakt-2.jpg", "Южная Америка"));
        continentList.add(new ContinentModel("https://8b08ab88-ee1b-4b04-9ae9-321e0da71ae2.selcdn.net/01837c0c-2280-4abb-8e7c-25dc2c29e278/%D0%9A%D0%BB%D0%B8%D0%BC%D0%B0%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D0%B5%20%D0%BF%D0%BE%D1%8F%D1%81%D0%B0%203-w400.png", "Африка"));
        continentList.add(new ContinentModel("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Australia_map_%28ru%29.svg/280px-Australia_map_%28ru%29.svg.png", "Австралия"));


        ArrayList<String> asiaCountries = new ArrayList<>();
        asiaCountries.add("Китай");
        asiaCountries.add("Индия");
        asiaCountries.add("Япония");
        asiaCountries.add("Индонезия");
        asiaCountries.add("Пакистан");

        ArrayList<String> europeCountries = new ArrayList<>();
        europeCountries.add("Германия");
        europeCountries.add("Франция");
        europeCountries.add("Италия");
        europeCountries.add("Испания");
        europeCountries.add("Великобритания");

        ArrayList<String> northAmericaCountries = new ArrayList<>();
        northAmericaCountries.add("США");
        northAmericaCountries.add("Канада");
        northAmericaCountries.add("Мексика");
        northAmericaCountries.add("Куба");
        northAmericaCountries.add("Ямайка");

        ArrayList<String> southAmericaCountries = new ArrayList<>();
        southAmericaCountries.add("Бразилия");
        southAmericaCountries.add("Аргентина");
        southAmericaCountries.add("Чили");
        southAmericaCountries.add("Колумбия");
        southAmericaCountries.add("Венесуэла");

        ArrayList<String> africaCountries = new ArrayList<>();
        africaCountries.add("Нигерия");
        africaCountries.add("Южная Африка");
        africaCountries.add("Кения");
        africaCountries.add("Египет");
        africaCountries.add("Эфиопия");

        ArrayList<String> australiaCountries = new ArrayList<>();
        australiaCountries.add("Австралия");
        australiaCountries.add("Новая Зеландия");
        australiaCountries.add("Папуа — Новая Гвинея");
        australiaCountries.add("Фиджи");
        australiaCountries.add("Тасмания");


        continentList.get(0).setCountries(asiaCountries);
        continentList.get(1).setCountries(europeCountries);
        continentList.get(2).setCountries(northAmericaCountries);
        continentList.get(3).setCountries(southAmericaCountries);
        continentList.get(4).setCountries(africaCountries);
        continentList.get(5).setCountries(australiaCountries);




    }

    @Override
    public void OnitemClick(int position) {
        ContinentModel continentModel = continentList.get(position);
        Toast.makeText(requireContext(), continentModel.getName(), Toast.LENGTH_SHORT).show();

        CountryFragment countryFragment = new CountryFragment();
        countryFragment.displayCountries(continentModel.getCountries());

        getParentFragmentManager().beginTransaction()
                .replace(R.id.conteiner, countryFragment)
                .addToBackStack(null)
                .commit();
    }
}
